package com.example.warehouseManager.Controller;


import com.example.warehouseManager.Model.SKU;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/sku")
public class SKUController extends GenericController<SKU> {

}
