package com.example.BookBack.controller;

import com.example.BookBack.model.Book;
import com.example.BookBack.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


import org.springframework.http.MediaType;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:5173")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/getFour")
    @CrossOrigin(origins = "http://localhost:5173")
    public Page<Book> getBooks(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int size){
        Pageable pageable = PageRequest.of(page, size);
        return bookService.getFour(pageable);
    }

    @GetMapping("/getAll")
    public List<Book> getAll(){
        return bookService.getAll();
    }


//    @PostMapping("/postBook")
//    public void postBook(@RequestBody Book book){
//        bookService.postBook(book);
//    }

    @PostMapping(
            value = "/postBook",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public void postBook(
            @ModelAttribute Book book,
            @RequestParam("image") MultipartFile image
    ) throws IOException {

        String fileName = UUID.randomUUID() + "_" +
                image.getOriginalFilename();

        Path uploadPath = Paths.get("uploads/books");

        Files.createDirectories(uploadPath);

        Files.copy(
                image.getInputStream(),
                uploadPath.resolve(fileName),
                StandardCopyOption.REPLACE_EXISTING
        );

        book.setImageUrl("/uploads/books/" + fileName);

        bookService.postBook(book);
    }

    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String query) {
        return bookService.searchBooks(query);
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
