package com.example.warehouseManager.Model.Generic;

import jakarta.persistence.*;

@MappedSuperclass
public class GenericEntity<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
