package com.example.BookBack.service;

import com.example.BookBack.model.Order;
import com.example.BookBack.model.OrderItem;
import com.example.BookBack.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository){
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> getAll(){
        return orderItemRepository.findAll();
    }



    public Optional<OrderItem> getById(int id){
        return orderItemRepository.findById(id);
    }

    public void post(OrderItem orderItem){
        orderItemRepository.save(orderItem);
    }

    public void delete(int id){
        orderItemRepository.deleteById(id);
    }


}
