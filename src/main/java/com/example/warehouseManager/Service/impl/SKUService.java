package com.example.warehouseManager.Service.impl;


import com.example.warehouseManager.Model.SKU;
import com.example.warehouseManager.Repository.SKURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SKUService {

    @Autowired
    private final SKURepository skuRepository;

    public SKUService(SKURepository skuRepository) {
        this.skuRepository = skuRepository;
    }

    public List<SKU> listAllSKUs() { return skuRepository.findAll();}

    public SKU getSKUById(Long id) {
        boolean exists = skuRepository.existsById(id);
        if(exists) {
            return skuRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public void addNewSKU(SKU sku) {
        skuRepository.save(sku);
    }
}
