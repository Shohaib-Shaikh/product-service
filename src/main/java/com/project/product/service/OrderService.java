package com.project.product.service;

import com.project.product.entities.Order;

import java.util.List;

public interface OrderService {

    Order create(Order order);

    List<Order> getList();

}
