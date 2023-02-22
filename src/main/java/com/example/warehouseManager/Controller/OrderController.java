package com.example.warehouseManager.Controller;


import com.example.warehouseManager.Controller.Generic.GenericController;
import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Model.Order;
import com.example.warehouseManager.Service.Generic.GenericService;
import com.example.warehouseManager.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/order")
public class OrderController extends GenericController<Order> {

}
