package com.learning.core.day03session2.D03P08;

import java.sql.Date;

public class Book  implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date publicationDate;

    public Book(int bookId, String title, double price, String author, Date publicationDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

//     Implementing Comparable interface
    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.bookId, other.bookId);
    }
//    
    
//    // Implementing Comparable interface based on author names
//    @Override
//    public int compareTo(Book other) {
//        return this.author.compareTo(other.author);
//    }

    // Override toString method
    @Override
    public String toString() {
        return bookId + " " + title + " " + price + " " + author + " " + publicationDate;
    }
}