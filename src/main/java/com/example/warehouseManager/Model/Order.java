package com.example.warehouseManager.Model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "orders")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id"
//)
public class Order extends GenericEntity {


    @JsonBackReference("customer")
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @JsonManagedReference(value = "order")
    @OneToMany(mappedBy = "order")
    private List<SKU> skus;
}
