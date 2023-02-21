//package com.example.warehouseManager.Controller;
//
//
//import com.example.warehouseManager.Model.Customer;
//import com.example.warehouseManager.Model.Order;
//import com.example.warehouseManager.Service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(path = "api/v1/order")
//public class OrderController {
//
//    private final OrderService orderService;
//
//    @Autowired
//    public OrderController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    @GetMapping("{orderId}")
//    public Order getOrderById(@PathVariable("orderId") Long id) {
//        return orderService.getOrderById(id);
//    }
//
//    @PostMapping
//    public void placeNewOrder(@RequestBody Order order) {
//        orderService.addNewOrder(order);
//    }
//
//}
