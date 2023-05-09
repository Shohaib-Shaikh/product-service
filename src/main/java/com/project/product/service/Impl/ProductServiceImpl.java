package com.project.product.service.Impl;

import com.project.product.client.UserClient;
import com.project.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private UserClient userClient;


    @Override
    public String getMessage() {
        return "Product Service Message";
    }

    @Override
    public String getUserServiceMessage() {
        return userClient.getMessageFromUserService();
    }


}
