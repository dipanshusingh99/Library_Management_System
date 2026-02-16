package com.Library;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully: " + title);
        } else {
            System.out.println("Book already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully: " + title);
        } else {
            System.out.println("Book was not issued.");
        }
    }

    public void displayBook() {
        System.out.println(bookId + " | " + title + " | " + author +
                " | Issued: " + isIssued);
    }
}
