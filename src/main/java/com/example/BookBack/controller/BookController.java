package com.example.BookBack.controller;

import com.example.BookBack.model.Book;
import com.example.BookBack.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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


    @PostMapping("/postBook")
    public void postBook(@RequestBody Book book){
        bookService.postBook(book);
    }

    @GetMapping("/get/{id}")
    public Optional<Book> getById(@PathVariable int id){
        return bookService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){
        bookService.deleteById(id);
    }




}
