package Hw4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void populateList() {
        try {
            File file = new File("Collections 1/books.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int numberOfPages = Integer.parseInt(parts[1].trim());
                books.add(new Book(name, numberOfPages));
            }
        } catch (IOException e) {
            System.out.println("error");
        }

    }

}

