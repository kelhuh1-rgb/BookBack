package com.example.BookBack.service;

import com.example.BookBack.model.Author;
import com.example.BookBack.model.Order;
import com.example.BookBack.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public List<Order> getAll(){
        return orderRepository.findAll();
    }



    public Optional<Order> getById(int id){
        return orderRepository.findById(id);
    }

    public void post(Order order){
        orderRepository.save(order);
    }

    public void delete(int id){
        orderRepository.deleteById(id);
    }



}
