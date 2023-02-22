//package com.example.warehouseManager.Model;
//
//
//import com.example.warehouseManager.Model.Generic.GenericEntity;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.List;
//import java.util.Objects;
//
//@Entity
//@Table(name = "suppliers")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class Supplier extends GenericEntity<Supplier> {
//
//    @Column(nullable = false)
//    private String name;
//
//    @JsonManagedReference(value = "supplier")
//    @OneToMany(mappedBy = "supplier")
//    private List<SKU> skus;
//
//}
