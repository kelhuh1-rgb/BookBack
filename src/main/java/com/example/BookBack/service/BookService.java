package com.example.BookBack.service;

import com.example.BookBack.model.Book;
import com.example.BookBack.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    public Optional<Book> getById(int id){
        return bookRepository.findById(id);
    }

    public void deleteById(int id){
        bookRepository.deleteById(id);
    }

    public void postBook(Book book){
        bookRepository.save(book);
    }

}
