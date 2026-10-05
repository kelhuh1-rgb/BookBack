package com.example.BookBack.controller;

import com.example.BookBack.model.Author;
import com.example.BookBack.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAll(){
        return authorService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Author> getById(@PathVariable int id){
        return authorService.getById(id);
    }

    @PostMapping("/post")
    public void postAuthor(@RequestBody Author author){
        authorService.postAuthor(author);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){
        authorService.deleteById(id);
    }


}
