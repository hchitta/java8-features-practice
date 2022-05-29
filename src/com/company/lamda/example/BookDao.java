package com.company.lamda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"ramayan",400));
        books.add(new Book(2,"tenaliraman",300));
        books.add(new Book(3,"java",600));
        return books;
    }
}
