package com.example.warehouseManager.Controller;

import com.example.warehouseManager.Model.GenericEntity;
import com.example.warehouseManager.Service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GenericController<T extends GenericEntity> {

    @Autowired
    private GenericService<T> genericService;

    @GetMapping
    public List<T> findAll() throws Exception {
        return genericService.findAll();
    }
}
