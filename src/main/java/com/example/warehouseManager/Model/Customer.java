package com.example.warehouseManager.Model;

import com.example.warehouseManager.Model.Generic.GenericEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "customers")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends GenericEntity<Customer> {

    @Column(nullable = false)
    private String name;

//    @JsonManagedReference(value = "customer")
//    @OneToMany(mappedBy = "customer")
//    List<Order> orders;
}
