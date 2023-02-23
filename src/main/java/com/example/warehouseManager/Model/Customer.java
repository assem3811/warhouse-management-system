package com.example.warehouseManager.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
