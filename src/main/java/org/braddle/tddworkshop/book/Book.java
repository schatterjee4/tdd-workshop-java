package org.braddle.tddworkshop.book;

public class Book {

    private String isbn;

    private String ean;

    private String title;

    private String author;

    private double price;

    private int yearPublished;

    public Book(String isbn, String ean, String title, String author, double price, int yearPublished) {
        this.isbn = isbn;
        this.ean = ean;
        this.title = title;
        this.author = author;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEan() {
        return ean;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
