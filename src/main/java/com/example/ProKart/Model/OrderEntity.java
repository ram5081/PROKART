package com.example.ProKart.Model;

import com.example.ProKart.Model.Enum.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.sql.results.graph.collection.internal.ListInitializerProducer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String orderNo; //UUID

    double totalValue;

    @Enumerated(EnumType.STRING)
    OrderStatus orderStatus;

    @CreationTimestamp
    Date orderedAt;

    @ManyToOne
    @JoinColumn // creates foreign key
    Customer customer;

    @ManyToMany(mappedBy = "orders")
    List<Product> products = new ArrayList<>();


}
