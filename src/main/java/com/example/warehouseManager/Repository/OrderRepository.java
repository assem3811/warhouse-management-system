package com.example.warehouseManager.Repository;

import com.example.warehouseManager.Model.Order;
import com.example.warehouseManager.Repository.Generic.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends GenericRepository<Order> {
}
