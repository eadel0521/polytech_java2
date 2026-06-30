package com.survivalcoding;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private String getDateOnly(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title)
                && getDateOnly(this.publishDate).equals(getDateOnly(book.publishDate));
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, getDateOnly(publishDate));
    }

    @Override
    public int compareTo(Book other) {
        long thisTime = this.publishDate.getTime();
        long otherTime = other.publishDate.getTime();

        if (thisTime > otherTime) {
            return -1;
        } else if (thisTime < otherTime) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", comment='" + comment + '\'' +
                '}';
    }
}