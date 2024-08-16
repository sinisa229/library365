package com.library365.service.criteria;

import com.library365.domain.enumeration.BookFormat;
import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;
import org.springdoc.core.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link com.library365.domain.Book} entity. This class is used
 * in {@link com.library365.web.rest.BookResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /books?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class BookCriteria implements Serializable, Criteria {

    /**
     * Class for filtering BookFormat
     */
    public static class BookFormatFilter extends Filter<BookFormat> {

        public BookFormatFilter() {}

        public BookFormatFilter(BookFormatFilter filter) {
            super(filter);
        }

        @Override
        public BookFormatFilter copy() {
            return new BookFormatFilter(this);
        }
    }

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter title;

    private StringFilter subTitle;

    private StringFilter author;

    private StringFilter genre;

    private StringFilter isbn;

    private StringFilter numberOfPages;

    private StringFilter publisher;

    private StringFilter edition;

    private BookFormatFilter format;

    private StringFilter description;

    private Boolean distinct;

    public BookCriteria() {}

    public BookCriteria(BookCriteria other) {
        this.id = other.optionalId().map(LongFilter::copy).orElse(null);
        this.title = other.optionalTitle().map(StringFilter::copy).orElse(null);
        this.subTitle = other.optionalSubTitle().map(StringFilter::copy).orElse(null);
        this.author = other.optionalAuthor().map(StringFilter::copy).orElse(null);
        this.genre = other.optionalGenre().map(StringFilter::copy).orElse(null);
        this.isbn = other.optionalIsbn().map(StringFilter::copy).orElse(null);
        this.numberOfPages = other.optionalNumberOfPages().map(StringFilter::copy).orElse(null);
        this.publisher = other.optionalPublisher().map(StringFilter::copy).orElse(null);
        this.edition = other.optionalEdition().map(StringFilter::copy).orElse(null);
        this.format = other.optionalFormat().map(BookFormatFilter::copy).orElse(null);
        this.description = other.optionalDescription().map(StringFilter::copy).orElse(null);
        this.distinct = other.distinct;
    }

    @Override
    public BookCriteria copy() {
        return new BookCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public Optional<LongFilter> optionalId() {
        return Optional.ofNullable(id);
    }

    public LongFilter id() {
        if (id == null) {
            setId(new LongFilter());
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getTitle() {
        return title;
    }

    public Optional<StringFilter> optionalTitle() {
        return Optional.ofNullable(title);
    }

    public StringFilter title() {
        if (title == null) {
            setTitle(new StringFilter());
        }
        return title;
    }

    public void setTitle(StringFilter title) {
        this.title = title;
    }

    public StringFilter getSubTitle() {
        return subTitle;
    }

    public Optional<StringFilter> optionalSubTitle() {
        return Optional.ofNullable(subTitle);
    }

    public StringFilter subTitle() {
        if (subTitle == null) {
            setSubTitle(new StringFilter());
        }
        return subTitle;
    }

    public void setSubTitle(StringFilter subTitle) {
        this.subTitle = subTitle;
    }

    public StringFilter getAuthor() {
        return author;
    }

    public Optional<StringFilter> optionalAuthor() {
        return Optional.ofNullable(author);
    }

    public StringFilter author() {
        if (author == null) {
            setAuthor(new StringFilter());
        }
        return author;
    }

    public void setAuthor(StringFilter author) {
        this.author = author;
    }

    public StringFilter getGenre() {
        return genre;
    }

    public Optional<StringFilter> optionalGenre() {
        return Optional.ofNullable(genre);
    }

    public StringFilter genre() {
        if (genre == null) {
            setGenre(new StringFilter());
        }
        return genre;
    }

    public void setGenre(StringFilter genre) {
        this.genre = genre;
    }

    public StringFilter getIsbn() {
        return isbn;
    }

    public Optional<StringFilter> optionalIsbn() {
        return Optional.ofNullable(isbn);
    }

    public StringFilter isbn() {
        if (isbn == null) {
            setIsbn(new StringFilter());
        }
        return isbn;
    }

    public void setIsbn(StringFilter isbn) {
        this.isbn = isbn;
    }

    public StringFilter getNumberOfPages() {
        return numberOfPages;
    }

    public Optional<StringFilter> optionalNumberOfPages() {
        return Optional.ofNullable(numberOfPages);
    }

    public StringFilter numberOfPages() {
        if (numberOfPages == null) {
            setNumberOfPages(new StringFilter());
        }
        return numberOfPages;
    }

    public void setNumberOfPages(StringFilter numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public StringFilter getPublisher() {
        return publisher;
    }

    public Optional<StringFilter> optionalPublisher() {
        return Optional.ofNullable(publisher);
    }

    public StringFilter publisher() {
        if (publisher == null) {
            setPublisher(new StringFilter());
        }
        return publisher;
    }

    public void setPublisher(StringFilter publisher) {
        this.publisher = publisher;
    }

    public StringFilter getEdition() {
        return edition;
    }

    public Optional<StringFilter> optionalEdition() {
        return Optional.ofNullable(edition);
    }

    public StringFilter edition() {
        if (edition == null) {
            setEdition(new StringFilter());
        }
        return edition;
    }

    public void setEdition(StringFilter edition) {
        this.edition = edition;
    }

    public BookFormatFilter getFormat() {
        return format;
    }

    public Optional<BookFormatFilter> optionalFormat() {
        return Optional.ofNullable(format);
    }

    public BookFormatFilter format() {
        if (format == null) {
            setFormat(new BookFormatFilter());
        }
        return format;
    }

    public void setFormat(BookFormatFilter format) {
        this.format = format;
    }

    public StringFilter getDescription() {
        return description;
    }

    public Optional<StringFilter> optionalDescription() {
        return Optional.ofNullable(description);
    }

    public StringFilter description() {
        if (description == null) {
            setDescription(new StringFilter());
        }
        return description;
    }

    public void setDescription(StringFilter description) {
        this.description = description;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public Optional<Boolean> optionalDistinct() {
        return Optional.ofNullable(distinct);
    }

    public Boolean distinct() {
        if (distinct == null) {
            setDistinct(true);
        }
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final BookCriteria that = (BookCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(title, that.title) &&
            Objects.equals(subTitle, that.subTitle) &&
            Objects.equals(author, that.author) &&
            Objects.equals(genre, that.genre) &&
            Objects.equals(isbn, that.isbn) &&
            Objects.equals(numberOfPages, that.numberOfPages) &&
            Objects.equals(publisher, that.publisher) &&
            Objects.equals(edition, that.edition) &&
            Objects.equals(format, that.format) &&
            Objects.equals(description, that.description) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, subTitle, author, genre, isbn, numberOfPages, publisher, edition, format, description, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BookCriteria{" +
            optionalId().map(f -> "id=" + f + ", ").orElse("") +
            optionalTitle().map(f -> "title=" + f + ", ").orElse("") +
            optionalSubTitle().map(f -> "subTitle=" + f + ", ").orElse("") +
            optionalAuthor().map(f -> "author=" + f + ", ").orElse("") +
            optionalGenre().map(f -> "genre=" + f + ", ").orElse("") +
            optionalIsbn().map(f -> "isbn=" + f + ", ").orElse("") +
            optionalNumberOfPages().map(f -> "numberOfPages=" + f + ", ").orElse("") +
            optionalPublisher().map(f -> "publisher=" + f + ", ").orElse("") +
            optionalEdition().map(f -> "edition=" + f + ", ").orElse("") +
            optionalFormat().map(f -> "format=" + f + ", ").orElse("") +
            optionalDescription().map(f -> "description=" + f + ", ").orElse("") +
            optionalDistinct().map(f -> "distinct=" + f + ", ").orElse("") +
        "}";
    }
}
