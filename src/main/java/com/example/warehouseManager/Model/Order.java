package com.example.warehouseManager.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Order extends GenericEntity {


    @JsonBackReference("customer")
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @JsonManagedReference(value = "order")
    @OneToMany(mappedBy = "order")
    private List<SKU> skus;
}
