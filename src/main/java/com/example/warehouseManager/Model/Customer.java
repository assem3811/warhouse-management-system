package com.example.warehouseManager.Model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customers")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id"
//)
public class Customer extends GenericEntity {


    @Column(nullable = false)
    private String name;

    @JsonManagedReference(value = "customer")
    @OneToMany(mappedBy = "customer")
    List<Order> orders;

}
