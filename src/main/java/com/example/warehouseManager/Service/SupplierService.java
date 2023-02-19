package com.example.warehouseManager.Service;


import com.example.warehouseManager.Model.Supplier;
import com.example.warehouseManager.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier getSupplierById(Long id) {
        Supplier supplier = supplierRepository.findById(id).get();
        return supplier != null ? supplier : null;
    }

    public void addNewSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    public void updateSupplierDetails(Long id, String nameToBeChanged) {
        if(supplierRepository.existsById(id)) {
            Supplier supplier = supplierRepository.findById(id).get();
            supplier.setName(nameToBeChanged);
            supplierRepository.save(supplier);
        }
    }

    public void deleteSupplierById(Long id) {
        if(supplierRepository.existsById(id)) {
            supplierRepository.deleteById(id);
        }
    }
}
