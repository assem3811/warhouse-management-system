package com.example.warehouseManager.Controller;


import com.example.warehouseManager.Model.Order;
<<<<<<< HEAD
import com.example.warehouseManager.Service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> first
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/order")
public class OrderController extends GenericController<Order> {

}
