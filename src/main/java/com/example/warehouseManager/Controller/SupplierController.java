package com.example.warehouseManager.Controller;

import com.example.warehouseManager.Model.Supplier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/supplier")
public class SupplierController extends GenericController<Supplier> {

}
