package com.company.lamda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort() {
        List<Book> books = new BookDao().getBooks();

        //Comparator<Book> bookComparator = (o1,o2) -> o1.getName().compareTo(o2.getName());

        Collections.sort(books,(o1,o2) -> o1.getName().compareTo(o2.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

/*class MyComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}*/
