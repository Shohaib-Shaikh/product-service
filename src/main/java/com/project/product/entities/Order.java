package com.project.product.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order")
public class Order {
    @Id
    private long id;
    private Date orderDate;
    private Date deliveryDate;
    private Boolean isPaymentDone;
}
