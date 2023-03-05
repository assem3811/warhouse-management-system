package com.example.warehouseManager.Controller;


import com.example.warehouseManager.Model.OrderItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/order_item")
public class OrderItemController extends GenericController<OrderItem> {
}
