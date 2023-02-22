package com.example.warehouseManager.Model;


import com.example.warehouseManager.Model.Generic.GenericEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "storage_location")
@Data
public class StorageLocation extends GenericEntity {


    @Column(nullable = false)
    private int sectionNumber;

    @Column(nullable = false)
    private int shelfNumber;

    @Column(nullable = false)
    private int unitNumber;

    @Column(nullable = false)
    private double maxCapacity;

    @JsonBackReference(value = "sku")
    @OneToOne(mappedBy = "storageLocation")
    private SKU sku;
}
