package com.Library;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            b.displayBook();
        }
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                b.issueBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
