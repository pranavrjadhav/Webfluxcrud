package com.example.webfluxcrud.repository;

import com.example.webfluxcrud.repository.entity.CarEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CarRepository extends R2dbcRepository<CarEntity,Integer> {
}
