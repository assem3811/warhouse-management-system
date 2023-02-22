package com.example.warehouseManager.Controller;

import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Service.CustomerService;
import com.example.warehouseManager.Service.Generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController<T> {

    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        try {
            return customerService.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
