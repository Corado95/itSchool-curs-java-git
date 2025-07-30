package org.example.session18;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private Integer pages;
    private String isbn;

    public Book(String title, String author, Integer pages, String isbn) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    @Override

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(pages, book.pages);

    }

    @Override

    public int hashCode() {
        return Objects.hash(title, author, pages, isbn);

    }

    @Override
    public String toString() {
        return "Book[" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", isbn='" + isbn + '\'' +
                ']';
    }


}


class LibraryDemo {

    public static void main(String[] args) {
        Book b1 = new Book ("Clean Code", "Robert C. Martin", 464, "978-0132350884");
        Book b2 = new Book ("Clean Code", "Robert C. Martin", 464, "978-0132350884");
        Book b3 = new Book ("Effective Java", "Joshua Bloch", 416, "978-0134686097");


        System.out.println("b1 equals b2: " + b1.equals(b2)); //true
        System.out.println("b1 equals b3: " + b1.equals(b3)); //false

        System.out.println("--------HASHCODE COMPARISON--------");

        System.out.println("hascode b1: " + b1.hashCode());
        System.out.println("hascode b2: " + b2.hashCode());
        System.out.println("hascode b3: " + b3.hashCode());

        System.out.println("--------TO STRING--------");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

    }
}