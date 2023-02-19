package com.example.warehouseManager.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "storage_location")
public class StorageLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "storage_location_id",
            sequenceName = "storage_location_id",
            allocationSize = 1
    )
    private Long id;

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

    public StorageLocation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StorageLocation that = (StorageLocation) o;
        return sectionNumber == that.sectionNumber && shelfNumber == that.shelfNumber && unitNumber == that.unitNumber && Double.compare(that.maxCapacity, maxCapacity) == 0 && Objects.equals(id, that.id) && Objects.equals(sku, that.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sectionNumber, shelfNumber, unitNumber, maxCapacity, sku);
    }

    @Override
    public String toString() {
        return "StorageLocation{" +
                "id=" + id +
                ", sectionNumber=" + sectionNumber +
                ", shelfNumber=" + shelfNumber +
                ", unitNumber=" + unitNumber +
                ", maxCapacity=" + maxCapacity +
                ", sku=" + sku +
                '}';
    }
}
