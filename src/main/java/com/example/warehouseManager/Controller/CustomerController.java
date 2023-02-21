package com.example.warehouseManager.Controller;


import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public void registerNewCustomer(@RequestBody Customer customer) {
        customerService.addNewCustomer(customer);
    }

    @PutMapping("{customerId}")
    public void updateCustomer(
            @PathVariable("customerId") Long id,
            @RequestBody Customer customer
    ) {
        customerService.updateCustomerDetails(id, customer.getName());
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long id) {
        customerService.deleteCustomerById(id);
    }
}
