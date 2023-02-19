package com.example.warehouseManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class WarehouseManagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(WarehouseManagerApplication.class, args);
	}

}
