package com.project.product.service;

import com.project.product.entities.Product;

import java.util.List;

public interface ProductService {

    String getMessage();

    String getUserServiceMessage();

    Product createProduct(Product product);

    List<Product> getList();
}
