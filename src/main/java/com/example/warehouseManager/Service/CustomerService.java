package com.example.warehouseManager.Service;

import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Repository.CustomerRepository;
import com.example.warehouseManager.Service.Generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public interface CustomerService extends GenericService<Customer> {
}

