package com.example.warehouseManager.Controller;

import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController extends GenericController<Customer> {
}
