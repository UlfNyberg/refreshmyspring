package com.example.refreshmyspring.controller;

import com.example.refreshmyspring.models.Book;
import com.example.refreshmyspring.models.Response;
import com.example.refreshmyspring.repositories.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2022-02-21
 * Time: 13:41
 * Project: refreshmyspring
 * Copyright: MIT
 */
@RestController
public class BookController {


    BookDAO bookDao = new BookDAO();

    @RequestMapping("/books")
    public List<Book> index(){
        return bookDao.getAllBooks();
    }

    @RequestMapping("/books/{id}")
    public Book getBooksByID(@PathVariable int id){
        Book res = new Book();
        for (Book b: bookDao.getAllBooks()) {
            if (b.getId() == id){
                res = b;
            }
        }
        return res;
    }

    @RequestMapping("/books/{id}/delete")
    public Response deleteBookById(@PathVariable int id){
        Response res = new Response("Book deleted", Boolean.FALSE);

        int indexToRemove = -1;
        for (int i = 0; i < bookDao.getAllBooks().size() ; i++) {
            if(bookDao.getAllBooks().get(i).getId() == id){
                indexToRemove = i;
            }
        }

        if(indexToRemove != -1);{
            bookDao.getAllBooks().remove(indexToRemove);
            res.setStatus(Boolean.TRUE);
        }
        return res;
    }

    @PostMapping("/books/add")
    public Response addBook(@RequestBody Book b){
        System.out.println(b.getId() + " " + b.getAuthor() + " " + b.getTitle());
        Response res = new Response("Book added", Boolean.FALSE);
        bookDao.getAllBooks().add(b);
        res.setStatus(Boolean.TRUE);
        return res;
    }



}
