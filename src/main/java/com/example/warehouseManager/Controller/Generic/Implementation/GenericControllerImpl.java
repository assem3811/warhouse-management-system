package com.example.warehouseManager.Controller.Generic.Implementation;

import com.example.warehouseManager.Controller.Generic.GenericController;
import com.example.warehouseManager.Service.Generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GenericControllerImpl<T> implements GenericController<T> {

    @Autowired
    private final GenericService<T> genericService;

    public GenericControllerImpl(GenericService<T> genericService) {
        this.genericService = genericService;
    }

    @Override
    public List<T> findAll() throws Exception {
        try {
            return genericService.findAll();
        } catch (Exception e) {
            throw e;
        }
    }
}
