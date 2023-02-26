package com.example.warehouseManager.Service.Implementaion;

import com.example.warehouseManager.Model.Customer;
import com.example.warehouseManager.Model.GenericEntity;
import com.example.warehouseManager.Repository.GenericRepository;
import com.example.warehouseManager.Service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class GenericServiceImp<T extends GenericEntity> implements GenericService<T> {

    @Autowired
    private GenericRepository<T> genericRepository;

    @Override
    public List<T> findAll() throws Exception {
        try {
            return genericRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public T findById(Long id) throws Exception {
        try {
            return genericRepository.findById(id).get();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void addNewRecord(T t) throws Exception {
        try {
           genericRepository.save(t);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void update(Long id, T t) throws Exception {
        try {
            t.setId(id);
            genericRepository.save(t);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void deleteRecord(Long id) throws Exception {
        try {
            genericRepository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
