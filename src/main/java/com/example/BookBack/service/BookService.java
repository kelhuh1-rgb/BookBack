package com.example.BookBack.service;

import com.example.BookBack.model.Book;
import com.example.BookBack.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll(){
        return bookRepository.getAll();
    }

    public void postBook(Book book){
        bookRepository.addBook(book);
    }

}
