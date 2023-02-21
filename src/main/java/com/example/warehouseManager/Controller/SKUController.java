//package com.example.warehouseManager.Controller;
//
//
//import com.example.warehouseManager.Model.SKU;
//import com.example.warehouseManager.Service.SKUService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "api/v1/sku")
//public class SKUController {
//
//    @Autowired
//    private final SKUService skuService;
//
//    public SKUController(SKUService skuService) {
//        this.skuService = skuService;
//    }
//
//    @GetMapping
//    public List<SKU> getAllSKUs() {
//        return skuService.listAllSKUs();
//    }
//
//    @GetMapping("{SKUId}")
//    public SKU getSKUById(@PathVariable("SKUId") Long id) {
//        return skuService.getSKUById(id);
//    }
//
//    @PostMapping
//    public void addNewSKU(@RequestBody SKU sku) {
//        skuService.addNewSKU(sku);
//    }
//}
