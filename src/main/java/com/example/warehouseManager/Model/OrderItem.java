package com.example.warehouseManager.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "order_items")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class OrderItem extends GenericEntity{

    @JsonBackReference("order")
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @JsonManagedReference(value = "orderItem")
    @OneToMany(mappedBy = "orderItem")
    private List<SKU> skus;

}
