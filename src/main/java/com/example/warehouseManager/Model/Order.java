package com.example.warehouseManager.Model;

import com.example.warehouseManager.Model.Generic.GenericEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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
