package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("Books with same title and date (different time) are equal")
    void equalsTest() {

        Date morning = new Date(2024 - 1900, 0, 1, 9, 0, 0);  // 2024-01-01 09:00:00
        Date night = new Date(2024 - 1900, 0, 1, 23, 0, 0);   // 2024-01-01 23:00:00
        Book book1 = new Book("Java", morning, "comment1");
        Book book2 = new Book("Java", night, "comment2");

        assertEquals(book1, book2);
    }

    @Test
    @DisplayName("Books with different date are not equal")
    void notEqualsTest() {

        Date day1 = new Date(2024 - 1900, 0, 1);
        Date day2 = new Date(2024 - 1900, 0, 2);
        Book book1 = new Book("Java", day1, "comment");
        Book book2 = new Book("Java", day2, "comment");

        assertNotEquals(book1, book2);
    }

    @Test
    @DisplayName("compareTo returns negative when this book is more recent")
    void compareToTest() {

        Date oldDate = new Date(1000);
        Date newDate = new Date(2000);
        Book oldBook = new Book("Java", oldDate, "comment");
        Book newBook = new Book("Spring", newDate, "comment");

        assertTrue(newBook.compareTo(oldBook) < 0);
    }

    @Test
    @DisplayName("clone() creates a separate object with same field values")
    void cloneTest() {

        Book book = new Book("Java", new Date(), "comment");

        Book cloned = book.clone();

        assertNotSame(book, cloned);
        assertEquals(book, cloned);
    }
}
