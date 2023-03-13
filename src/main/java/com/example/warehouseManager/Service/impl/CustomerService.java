package com.example.warehouseManager.Service.impl;

import com.example.warehouseManager.Model.Customer;

<<<<<<< HEAD:src/main/java/com/example/warehouseManager/Service/impl/CustomerService.java
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

    public void save(M model) {
        baseRepository<M>.save(model);
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
=======
public interface CustomerService extends GenericService<Customer> {
>>>>>>> first:src/main/java/com/example/warehouseManager/Service/CustomerService.java
}

