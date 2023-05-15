package com.project.product.service.Impl;

import com.project.product.client.UserClient;
import com.project.product.entities.Product;
//import com.project.product.repository.ProductRepository;
import com.project.product.repository.ProductRepository;
import com.project.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private UserClient userClient;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public String getMessage() {
        return "Product Service Message";
    }

    @Override
    public String getUserServiceMessage() {
        return userClient.getMessageFromUserService();
    }

    @Override
    public Product createProduct(Product product) {
        Product save = productRepository.save(product);
        return save;
    }

    @Override
    public List<Product> getList() {
        return productRepository.findAll();
    }


}
