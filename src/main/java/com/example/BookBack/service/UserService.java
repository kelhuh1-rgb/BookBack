package com.example.BookBack.service;

import com.example.BookBack.model.User;
import com.example.BookBack.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> getById(long id){
        return userRepository.findById(id);
    }

    public void PostUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }


}
