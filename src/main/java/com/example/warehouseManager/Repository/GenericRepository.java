package com.example.warehouseManager.Repository;

import com.example.warehouseManager.Model.Generic.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

public interface GenericRepository<T extends GenericEntity> extends JpaRepository<T, Long> {
}
