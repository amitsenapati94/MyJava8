package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortItem {

    public static void main(String a[])
    {
        System.out.println("hi");


        List<Book> movies = Arrays.asList(
                new Book("Lord of the rings"),
                new Book("Back to the future"),
                new Book("Carlito's way"),
                new Book("Pulp fiction"));

        movies.sort(Comparator.comparing(Book::getTitle));

        movies.forEach(System.out::println);

    }
    }

class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}


