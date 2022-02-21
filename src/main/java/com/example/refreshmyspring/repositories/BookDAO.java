package com.example.refreshmyspring.repositories;

import com.example.refreshmyspring.models.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-21
 * Time: 13:35
 * Project: refreshmyspring
 * Copyright: MIT
 */
public class BookDAO {
        public List<Book>getAllBooks() {

            List<Book> bookList = new ArrayList<>();

            Book b1 = new Book("Mr Book McBook", "booky", 1);
            Book b2 = new Book("Mr Book McBook", "booky2", 2);
            Book b3 = new Book("Mr Book McBook", "booky3", 3);
            Book b4 = new Book("Mr Book McBook", "booky4", 4);
            Book b5 = new Book("Mr Book McBook", "booky5", 5);
            Book b6 = new Book("Mr Book McBook", "booky6", 6);

            bookList.add(b1);
            bookList.add(b2);
            bookList.add(b3);
            bookList.add(b4);
            bookList.add(b5);
            bookList.add(b6);

            return bookList;

        }
}
