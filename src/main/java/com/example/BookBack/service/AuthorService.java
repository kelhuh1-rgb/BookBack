package com.example.BookBack.service;

import com.example.BookBack.model.Author;
import com.example.BookBack.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public List<Author> getAll(){
        return authorRepository.findAll();
    }

    public Optional<Author> getById(int id){
        return authorRepository.findById(id);
    }

    public void postAuthor(Author author){
        authorRepository.save(author);
    }

    public void deleteById(int id){
        authorRepository.deleteById(id);
    }
}
