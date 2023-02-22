package com.example.warehouseManager.Model.Generic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
public class GenericEntity<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
