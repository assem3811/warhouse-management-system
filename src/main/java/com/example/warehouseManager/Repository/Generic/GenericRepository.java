package com.example.warehouseManager.Repository.Generic;

import com.example.warehouseManager.Model.Generic.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository<T extends GenericEntity> extends JpaRepository<T, Long> {
}
