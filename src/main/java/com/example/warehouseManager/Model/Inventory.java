package com.example.warehouseManager.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "inventory")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory extends GenericEntity {

}
