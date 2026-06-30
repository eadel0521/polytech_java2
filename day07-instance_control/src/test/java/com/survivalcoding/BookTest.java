package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("Books with same title and publishDate are equal")
    void equalsTest() {

        Date date = new Date();
        Book book1 = new Book("Java", date, "comment1");
        Book book2 = new Book("Java", date, "comment2");

        assertEquals(book1, book2);
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
    @DisplayName("clone creates a separate object with same field values")
    void cloneTest() {

        Book book = new Book("Java", new Date(), "comment");

        Book cloned = book.clone();

        assertNotSame(book, cloned);
        assertEquals(book, cloned);
    }
}
