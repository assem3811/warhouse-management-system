package com.example.warehouseManager.Controller;


import com.example.warehouseManager.Model.StorageLocation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/storage_location")
public class StorageLocationController extends GenericController<StorageLocation> {

}
