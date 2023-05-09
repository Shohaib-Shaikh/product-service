package com.project.product.controller;


import com.example.demo.utility.ConstantUrlHelper;
import com.project.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ConstantUrlHelper.PRODUCT_URL)
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(ConstantUrlHelper.MESSAGE_URL)
    public String getMessage(){
        return productService.getMessage();
    }

    @GetMapping(ConstantUrlHelper.USER_MESSAGE_URL)
    public String getMessageFromUser(){
        return productService.getUserServiceMessage();
    }

}
