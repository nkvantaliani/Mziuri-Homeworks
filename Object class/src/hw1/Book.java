package hw1;

import java.util.Objects;

public class Book {
    private String name;
    private int pages;
    private String genre;
    private Writer author;

    public Book(String name, int pages, String genre, Writer author) {
        this.name = name;
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public String toString() {
        return "hw1.Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(name, book.name) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, genre, author);
    }
}
