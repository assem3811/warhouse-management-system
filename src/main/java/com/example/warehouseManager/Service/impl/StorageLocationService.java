package com.example.warehouseManager.Service.impl;


import com.example.warehouseManager.Model.StorageLocation;
import com.example.warehouseManager.Repository.StorageLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageLocationService {

    @Autowired
    private final StorageLocationRepository storageLocationRepository;

    public StorageLocationService(StorageLocationRepository storageLocationRepository) {
        this.storageLocationRepository = storageLocationRepository;
    }

    public List<StorageLocation> listAllStorageLocations() { return storageLocationRepository.findAll();}

    public StorageLocation getStorageLocationById(Long id) {
        boolean exists = storageLocationRepository.existsById(id);
        if(exists) {
            return storageLocationRepository.findById(id).get();
        } else {
            return null;
        }
    }
    public void addNewStorageLocation(StorageLocation storageLocation) {
        storageLocationRepository.save(storageLocation);
    }
}
