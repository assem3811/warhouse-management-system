package com.example.warehouseManager.Repository;

import com.example.warehouseManager.Model.SKU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SKURepository extends JpaRepository<SKU, Long> {
}
