package com.example.warehouseManager.Repository;

import com.example.warehouseManager.Model.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericRepository<T extends GenericEntity> extends JpaRepository<T, Long> {
}
