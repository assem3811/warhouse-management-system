package com.example.warehouseManager.Controller.Generic;

import java.util.List;

public interface GenericController<T> {

    List<T> findAll() throws Exception;
}
