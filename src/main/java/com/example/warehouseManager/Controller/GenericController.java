package com.example.warehouseManager.Controller;

import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Model.GenericEntity;
import com.example.warehouseManager.Service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController<T extends GenericEntity> {

    @Autowired
    private GenericService<T> genericService;

    @GetMapping
    public List<T> findAll() throws Exception {
        return genericService.findAll();
    }

    @GetMapping("{recordId}")
    public T findById(@PathVariable("recordId") Long id) throws Exception {
        return genericService.findById(id);
    }

    @PostMapping(consumes = {"application/json"})
    public void addNewRecord(@RequestBody final T t) throws Exception {
        genericService.addNewRecord(t);
    }

    @PutMapping("{id}")
    public void update(
            @PathVariable("id") Long id,
            @RequestBody T t
    ) throws Exception {
        genericService.update(id, t);
    }

    @DeleteMapping("{recordId}")
    public void deleteRecord(@PathVariable("recordId") Long id) throws Exception {
        genericService.deleteRecord(id);
    }
}
