package com.example.webfluxcrud.repository.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.w3c.dom.Entity;

@Builder
@Setter
@Getter
@Table(name = "car")
public class CarEntity {

    @Id
    Integer id;
    String brand;
    Integer Kilowatt;
}
