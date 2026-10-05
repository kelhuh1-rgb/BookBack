package com.example.BookBack.service;

import com.example.BookBack.model.Favorite;
import com.example.BookBack.model.User;
import com.example.BookBack.repository.FavoriteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteService {
    private final FavoriteRepository favoriteRepository;

    public FavoriteService(FavoriteRepository favoriteRepository){
        this.favoriteRepository = favoriteRepository;
    }

    public List<Favorite> getAll(){
        return favoriteRepository.findAll();
    }

    public Optional<Favorite> getById(int id){
        return favoriteRepository.findById(id);
    }

    public void post(@RequestBody Favorite favorite){

        favoriteRepository.save(favorite);
    }

    public void delete(int id){
        favoriteRepository.deleteById(id);
    }


}
