package com.example.warehouseManager.Controller;

import com.example.warehouseManager.Model.Supplier;
import com.example.warehouseManager.Service.impl.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping
    public List<Supplier> getSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("{supplierId}")
    public Supplier getSupplierById(@PathVariable("supplierId") Long id) {
        return supplierService.getSupplierById(id);
    }

    @PostMapping
    public void registerNewSupplier(@RequestBody Supplier supplier) {
        supplierService.addNewSupplier(supplier);
    }

    @PutMapping("{supplierId}")
    public void updateSupplier(
            @PathVariable("supplierId") Long id,
            @RequestBody Supplier supplier
    ) {
        supplierService.updateSupplierDetails(id, supplier.getName());
    }

    @DeleteMapping("{supplierId}")
    public void deleteSupplier(@PathVariable("supplierId") Long id) {
        supplierService.deleteSupplierById(id);
    }
}
