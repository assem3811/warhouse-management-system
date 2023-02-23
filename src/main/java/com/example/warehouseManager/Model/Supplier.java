package com.example.warehouseManager.Model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "suppliers")
@Data
public class Supplier extends GenericEntity {

    @Column(nullable = false)
    private String name;

    @JsonManagedReference(value = "supplier")
    @OneToMany(mappedBy = "supplier")
    private List<SKU> skus;

}
