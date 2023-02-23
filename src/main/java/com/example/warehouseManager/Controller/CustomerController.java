package com.example.warehouseManager.Controller;

import com.example.warehouseManager.Controller.Generic.GenericController;
import com.example.warehouseManager.Model.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController extends GenericController<Customer> {

}
