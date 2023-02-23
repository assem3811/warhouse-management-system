package com.example.warehouseManager.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


enum type {single, dozen}
enum orientation {horizontal, vertical}
@Entity
@Table(name = "storage_keeping_units")
@Data
public class SKU extends GenericEntity {


    @Column(nullable = false)
    private  String name;

    private String description;
    @Enumerated(EnumType.STRING)
    @Column(name = "sku_type")
    private type skuType;

    @Enumerated(EnumType.STRING)
    @Column(name = "sku_orientaion")
    private orientation skuOrientaion;

    @Column(nullable = false)
    private double capacity;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    @Column(nullable = false)
    private double price;

    @JsonBackReference(value = "supplier")
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @JsonManagedReference(value = "order")
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @JsonManagedReference(value = "sku")
    @OneToOne
    @JoinColumn(name = "storage_location_id")
    private StorageLocation storageLocation;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date admittanceDate;

}
