package com.example.BookBack.controller;

import com.example.BookBack.model.Category;
import com.example.BookBack.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }


    @GetMapping("/{id}")
    public Optional<Category> getById(@PathVariable int id){
        return categoryService.getById(id);
    }

    @PostMapping("/post")
    public void postCategory(@RequestBody Category category){
        categoryService.post(category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable int id){
        categoryService.delete(id);
    }
}
