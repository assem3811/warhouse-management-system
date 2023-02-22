//package com.example.warehouseManager.Model;
//
//
//import com.example.warehouseManager.Model.Generic.GenericEntity;
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.Objects;
//
//@Entity
//@Table(name = "storage_location")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class StorageLocation extends GenericEntity<StorageLocation> {
//
//    @Column(nullable = false)
//    private int sectionNumber;
//
//    @Column(nullable = false)
//    private int shelfNumber;
//
//    @Column(nullable = false)
//    private int unitNumber;
//
//    @Column(nullable = false)
//    private double maxCapacity;
//
//    @JsonBackReference(value = "sku")
//    @OneToOne(mappedBy = "storageLocation")
//    private SKU sku;
//}
