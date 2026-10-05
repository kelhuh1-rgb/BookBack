package com.example.BookBack.controller;

import com.example.BookBack.model.Favorite;
import com.example.BookBack.model.Order;
import com.example.BookBack.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAll(){
        return orderService.getAll();
    }


    @GetMapping("/{id}")
    public Optional<Order> getById(@PathVariable int id){
        return orderService.getById(id);
    }

    @PostMapping("/post")
    public void postCategory(@RequestBody Order order){
        orderService.post(order);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        orderService.delete(id);
    }
}
