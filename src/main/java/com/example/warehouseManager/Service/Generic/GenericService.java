package com.example.warehouseManager.Service.Generic;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;



public interface GenericService<T> {

    List<T> findAll() throws Exception;
//    Optional<T> findById(Long id) throws Exception;
}
