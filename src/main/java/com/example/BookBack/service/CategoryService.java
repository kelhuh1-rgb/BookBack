package com.example.BookBack.service;

import com.example.BookBack.model.Category;
import com.example.BookBack.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> getById(int id){
        return categoryRepository.findById(id);
    }

    public void post(Category category){
        categoryRepository.save(category);
    }

    public void delete(int id){
        categoryRepository.deleteById(id);
    }
}
