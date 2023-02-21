package com.example.warehouseManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository<M> extends JpaRepository<M, Long> {
}
