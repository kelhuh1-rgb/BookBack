package com.example.BookBack.controller;

import com.example.BookBack.model.User;
import com.example.BookBack.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable long id){
        return userService.getById(id);
    }

    @PostMapping("/postUser")
    public void postUser(@RequestBody User user){
        userService.PostUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }


}
