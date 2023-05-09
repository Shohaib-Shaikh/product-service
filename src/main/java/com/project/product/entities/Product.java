package com.project.product.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

