package com.example.BookBack.controller;

import com.example.BookBack.model.Order;
import com.example.BookBack.model.OrderItem;
import com.example.BookBack.service.OrderItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orderItem")
public class OrderItemController {
    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService){
        this.orderItemService = orderItemService;
    }

    @GetMapping
    public List<OrderItem> getAll(){
        return orderItemService.getAll();
    }


    @GetMapping("/{id}")
    public Optional<OrderItem> getById(@PathVariable int id){
        return orderItemService.getById(id);
    }

    @PostMapping("/post")
    public void postCategory(@RequestBody OrderItem orderItem){
        orderItemService.post(orderItem);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        orderItemService.delete(id);
    }
}
