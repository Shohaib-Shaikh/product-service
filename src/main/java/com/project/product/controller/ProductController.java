package com.project.product.controller;


import com.example.demo.utility.ConstantUrlHelper;
import com.project.product.entities.Product;
import com.project.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping(ConstantUrlHelper.CREATE_URL)
    public Product createEntity(@RequestBody Product product){
            return productService.createProduct(product);
    }


    @GetMapping("/list")
    public List<Product> getList(){
        return productService.getList();
    }

}
