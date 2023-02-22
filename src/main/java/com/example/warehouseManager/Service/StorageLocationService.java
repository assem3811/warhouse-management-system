package com.example.warehouseManager.Service;


import com.example.warehouseManager.Model.StorageLocation;
import com.example.warehouseManager.Repository.StorageLocationRepository;
import com.example.warehouseManager.Service.Generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StorageLocationService extends GenericService<StorageLocation> {
}
