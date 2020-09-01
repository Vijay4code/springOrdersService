package com.learning.springOrdersService.controller;

import com.learning.springOrdersService.dto.OrderRequestDto;
import com.learning.springOrdersService.model.Order;
import com.learning.springOrdersService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrdersController {

    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/order")
    public @ResponseBody Order create(OrderRequestDto orderRequestDto){
        Order o = new Order();
        o.setOrderValue(orderRequestDto.getOrderValue());
        o.setCreatedAt(orderRequestDto.getCreatedAt());
        orderRepository.save(o);
        return o;
    }

    @GetMapping("/orders")
    public @ResponseBody Iterable<Order> allOrders(){
        return orderRepository.findAll();
    }

    @GetMapping("/order/{id}")
    public @ResponseBody Optional<Order> order(@PathVariable("id") int id){
        return orderRepository.findById(id);
    }

    @DeleteMapping("/order/{id}")
    public String deleteOrder(@PathVariable("id") int id){
        orderRepository.deleteById(id);
        return "ok";
    }

}
