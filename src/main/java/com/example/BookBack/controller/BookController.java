package com.example.BookBack.controller;

import com.example.BookBack.model.Book;
import com.example.BookBack.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/getAll")
    public List<Book> getBooks(){
        return bookService.getAll();
    }


    @PostMapping()
    public void postBook(Book book){
        bookService.postBook(book);
    }
}
