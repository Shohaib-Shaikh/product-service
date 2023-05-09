package com.project.product.service;

import com.project.product.entities.Product;

public interface ProductService {

    String getMessage();

    String getUserServiceMessage();


    Product createProduct(Product product);
}
