package com.example.warehouseManager.Controller;


import com.example.warehouseManager.Model.StorageLocation;
import com.example.warehouseManager.Service.impl.StorageLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/storage_location")
public class StorageLocationController {
    @Autowired
    private final StorageLocationService storageLocationService;


    public StorageLocationController(StorageLocationService storageLocationService) {
        this.storageLocationService = storageLocationService;
    }

    @GetMapping
    public List<StorageLocation> listAllStorageLocations() {
        return storageLocationService.listAllStorageLocations();
    }

    @GetMapping("{storageLocationId}")
    public StorageLocation getStorageLocationById(Long id) {
        return storageLocationService.getStorageLocationById(id);
    }

    @PostMapping
    public void addNewStorageLocation(@RequestBody StorageLocation storageLocation) {
        storageLocationService.addNewStorageLocation(storageLocation);
    }
}
