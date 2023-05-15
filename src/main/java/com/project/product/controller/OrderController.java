package com.project.product.controller;


import com.example.demo.utility.ConstantUrlHelper;
import com.project.product.entities.Order;
import com.project.product.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ConstantUrlHelper.ORDER_URL)
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(ConstantUrlHelper.CREATE_URL)
    public Order createEntity(@RequestBody Order order){
        return orderService.create(order);
    }

    @GetMapping("/list")
    public List<Order> getList(){
        return orderService.getList();
    }

}
