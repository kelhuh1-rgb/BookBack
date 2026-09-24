package com.example.BookBack.repository;

import com.example.BookBack.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {


    void addBook(Book book);

    List<Book> getAll();
}
