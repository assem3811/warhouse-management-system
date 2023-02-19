package com.example.warehouseManager.Service;

import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(Long id) {
        boolean exists = customerRepository.existsById(id);
        if (exists) {
            return customerRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public void addNewCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void updateCustomerDetails(
            Long id,
            String nameToBeChanged
    ) {
        if(customerRepository.existsById(id)) {
            Customer customer = customerRepository.findById(id).get();
            customer.setName(nameToBeChanged);
            customerRepository.save(customer);
        }
    }

    public void deleteCustomerById(Long id) {
        if(customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        }
    }
}

