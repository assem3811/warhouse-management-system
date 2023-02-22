package com.example.warehouseManager.Controller;

import com.example.warehouseManager.Controller.Generic.GenericController;
import com.example.warehouseManager.Model.Supplier;
import com.example.warehouseManager.Service.Generic.GenericService;
import com.example.warehouseManager.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/supplier")
public class SupplierController extends GenericController<Supplier> {

}
