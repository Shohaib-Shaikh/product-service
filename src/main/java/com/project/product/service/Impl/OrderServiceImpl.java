package com.project.product.service.Impl;

import com.project.product.entities.Order;
import com.project.product.repository.OrderRepository;
import com.project.product.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getList() {
        return orderRepository.findAll();
    }
}
