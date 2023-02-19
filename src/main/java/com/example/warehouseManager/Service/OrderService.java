package com.example.warehouseManager.Service;

import com.example.warehouseManager.Model.Order;
import com.example.warehouseManager.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order getOrderById(Long id) {
        boolean exists = orderRepository.existsById(id);
        if(exists) {
            return orderRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public void addNewOrder(Order order) {
        orderRepository.save(order);
    }

    //As per business logic order can not be updated
    //or deleted after it is placed
}
