package com.library365.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class BookTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    public static Book getBookSample1() {
        return new Book()
            .id(1L)
            .title("title1")
            .subTitle("subTitle1")
            .author("author1")
            .genre("genre1")
            .isbn("isbn1")
            .numberOfPages("numberOfPages1")
            .publisher("publisher1")
            .edition("edition1")
            .description("description1");
    }

    public static Book getBookSample2() {
        return new Book()
            .id(2L)
            .title("title2")
            .subTitle("subTitle2")
            .author("author2")
            .genre("genre2")
            .isbn("isbn2")
            .numberOfPages("numberOfPages2")
            .publisher("publisher2")
            .edition("edition2")
            .description("description2");
    }

    public static Book getBookRandomSampleGenerator() {
        return new Book()
            .id(longCount.incrementAndGet())
            .title(UUID.randomUUID().toString())
            .subTitle(UUID.randomUUID().toString())
            .author(UUID.randomUUID().toString())
            .genre(UUID.randomUUID().toString())
            .isbn(UUID.randomUUID().toString())
            .numberOfPages(UUID.randomUUID().toString())
            .publisher(UUID.randomUUID().toString())
            .edition(UUID.randomUUID().toString())
            .description(UUID.randomUUID().toString());
    }
}
