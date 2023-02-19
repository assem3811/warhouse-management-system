package com.example.warehouseManager.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;


enum type {single, dozen}
enum orientation {horizontal, vertical}
@Entity
@Table(name = "storage_keeping_units")
public class SKU {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "sku_id",
            sequenceName = "sku_id",
            allocationSize = 1
    )
    private long id;
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

    public SKU() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public type getSkuType() {
        return skuType;
    }

    public void setSkuType(type skuType) {
        this.skuType = skuType;
    }

    public orientation getSkuOrientaion() {
        return skuOrientaion;
    }

    public void setSkuOrientaion(orientation skuOrientaion) {
        this.skuOrientaion = skuOrientaion;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    public Date getAdmittanceDate() {
        return admittanceDate;
    }

    public void setAdmittanceDate(Date admittanceDate) {
        this.admittanceDate = admittanceDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SKU sku = (SKU) o;
        return id == sku.id && Double.compare(sku.capacity, capacity) == 0 && Double.compare(sku.price, price) == 0 && Objects.equals(name, sku.name) && Objects.equals(description, sku.description) && skuType == sku.skuType && skuOrientaion == sku.skuOrientaion && Objects.equals(expirationDate, sku.expirationDate) && Objects.equals(supplier, sku.supplier) && Objects.equals(order, sku.order) && Objects.equals(storageLocation, sku.storageLocation) && Objects.equals(admittanceDate, sku.admittanceDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, skuType, skuOrientaion, capacity, expirationDate, price, supplier, order, storageLocation, admittanceDate);
    }

    @Override
    public String toString() {
        return "SKU{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", skuType=" + skuType +
                ", skuOrientaion=" + skuOrientaion +
                ", capacity=" + capacity +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                ", supplier=" + supplier +
                ", order=" + order +
                ", storageLocation=" + storageLocation +
                ", admittanceDate=" + admittanceDate +
                '}';
    }
}
