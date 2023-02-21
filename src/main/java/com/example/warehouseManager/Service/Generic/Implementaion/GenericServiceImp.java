package com.example.warehouseManager.Service.Generic.Implementaion;

import com.example.warehouseManager.Repository.Generic.GenericRepository;
import com.example.warehouseManager.Service.Generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public class GenericServiceImp<T> implements GenericService<T> {

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

//    @Override
//    public Optional<T> findById(Long id) throws Exception {
//        try {
//            return genericRepository.findById(id);
//        } catch (Exception e) {
//            throw e;
//        }
//    }

//    @Override
//    public void updateRecord(Long id, T t) throws Exception {
//        try {
//            boolean exists = genericRepository.existsById(id);
//            if(exists) {
//                T temp = genericRepository.findById(id).get();
//
//            }
//        }
//    }
}
