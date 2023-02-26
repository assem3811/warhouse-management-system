package com.example.warehouseManager.Service;

import com.example.warehouseManager.Model.Customer;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;



public interface GenericService<T> {

    List<T> findAll() throws Exception;

    T findById(Long id) throws Exception;

    void addNewRecord(T t) throws Exception;

    void update(Long id, T t) throws Exception;

    void deleteRecord(Long id) throws Exception;
}
