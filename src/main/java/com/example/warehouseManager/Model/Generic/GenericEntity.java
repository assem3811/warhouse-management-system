package com.example.warehouseManager.Model.Generic;

import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
