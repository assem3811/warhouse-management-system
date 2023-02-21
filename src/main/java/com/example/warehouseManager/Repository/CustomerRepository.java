package com.example.warehouseManager.Repository;

import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Repository.Generic.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends GenericRepository<Customer> {
}
