package com.project.product.entities;

import lombok.*;
import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;


}

