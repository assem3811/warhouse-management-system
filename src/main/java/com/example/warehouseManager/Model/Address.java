package com.example.warehouseManager.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "addresses")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address extends GenericEntity{

    @Column(nullable = false)
    private int buildingNumber;

    @Column(nullable = false)
    private String streetName;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String city;

    @OneToOne(mappedBy = "address")
    private Customer customer;

}
