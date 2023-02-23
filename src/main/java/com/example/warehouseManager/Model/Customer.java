package com.example.warehouseManager.Model;

import com.example.warehouseManager.Model.Generic.GenericEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "customer")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends GenericEntity {


    @Column(nullable = false)
    private String name;

    @JsonManagedReference(value = "customer")
    @OneToMany(mappedBy = "customer")
    List<Order> orders;
}
