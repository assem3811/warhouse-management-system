package com.example.warehouseManager.Service.Implementaion;

import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Repository.CustomerRepository;
import com.example.warehouseManager.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp extends GenericServiceImp<Customer> implements CustomerService {

}
