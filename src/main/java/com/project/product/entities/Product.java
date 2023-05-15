package com.project.product.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "product")
public class Product {
    @Id
    private long id;
    private String name;
    private String image;
    private String color;
    private float price;
    private String description;
    private String highlights;
    private int quantity;
    private float discount;
    private String bankOffers;
    private String vendor;

}

