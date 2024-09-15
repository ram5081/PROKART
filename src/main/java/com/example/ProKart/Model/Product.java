package com.example.ProKart.Model;

import com.example.ProKart.Model.Enum.Category;
import com.example.ProKart.Model.Enum.ProductStatus;
import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    String productName;

    @Enumerated(EnumType.STRING)
    Category category;

    int quantity;

    @Enumerated(EnumType.STRING)
    ProductStatus productStatus;
}
