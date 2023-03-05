package com.example.warehouseManager.Controller;

import com.example.warehouseManager.Model.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/address")
public class AddressController extends GenericController<Address> {
}
