package com.learning.springOrdersService.controller;

import com.learning.springOrdersService.model.Order;
import com.learning.springOrdersService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, You!";
    }

}
