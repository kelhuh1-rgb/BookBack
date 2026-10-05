package com.example.BookBack.controller;

import com.example.BookBack.model.Category;
import com.example.BookBack.model.Favorite;
import com.example.BookBack.service.FavoriteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/favorite")
public class FavoriteController {

    private final FavoriteService favoriteService;

    public FavoriteController(FavoriteService favoriteService){
        this.favoriteService=favoriteService;
    }

    @GetMapping
    public List<Favorite> getAll(){
        return favoriteService.getAll();
    }


    @GetMapping("/{id}")
    public Optional<Favorite> getById(@PathVariable int id){
        return favoriteService.getById(id);
    }

    @PostMapping("/post")
    public void postCategory(@RequestBody Favorite favorite){
        favoriteService.post(favorite);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable int id){
        favoriteService.delete(id);
    }
}
