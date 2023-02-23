package com.example.warehouseManager.Controller;


import com.example.warehouseManager.Controller.Generic.GenericController;
import com.example.warehouseManager.Model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/order")
public class OrderController extends GenericController<Order> {

}
