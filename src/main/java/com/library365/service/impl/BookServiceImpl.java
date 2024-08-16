package com.library365.service.impl;

import com.library365.domain.Book;
import com.library365.repository.BookRepository;
import com.library365.service.BookService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link com.library365.domain.Book}.
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

    private static final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        log.debug("Request to save Book : {}", book);
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        log.debug("Request to update Book : {}", book);
        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> partialUpdate(Book book) {
        log.debug("Request to partially update Book : {}", book);

        return bookRepository
            .findById(book.getId())
            .map(existingBook -> {
                if (book.getTitle() != null) {
                    existingBook.setTitle(book.getTitle());
                }
                if (book.getSubTitle() != null) {
                    existingBook.setSubTitle(book.getSubTitle());
                }
                if (book.getAuthor() != null) {
                    existingBook.setAuthor(book.getAuthor());
                }
                if (book.getGenre() != null) {
                    existingBook.setGenre(book.getGenre());
                }
                if (book.getIsbn() != null) {
                    existingBook.setIsbn(book.getIsbn());
                }
                if (book.getNumberOfPages() != null) {
                    existingBook.setNumberOfPages(book.getNumberOfPages());
                }
                if (book.getPublisher() != null) {
                    existingBook.setPublisher(book.getPublisher());
                }
                if (book.getEdition() != null) {
                    existingBook.setEdition(book.getEdition());
                }
                if (book.getFormat() != null) {
                    existingBook.setFormat(book.getFormat());
                }
                if (book.getDescription() != null) {
                    existingBook.setDescription(book.getDescription());
                }

                return existingBook;
            })
            .map(bookRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Book> findOne(Long id) {
        log.debug("Request to get Book : {}", id);
        return bookRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Book : {}", id);
        bookRepository.deleteById(id);
    }
}
