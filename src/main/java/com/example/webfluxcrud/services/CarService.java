package com.example.webfluxcrud.services;

import com.example.webfluxcrud.controller.dto.CarDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CarService {


    Mono<CarDto> getCar(Integer carId);
    Mono<CarDto> createCar(CarDto carDto);
    Mono<CarDto> updateCar(Integer carId,CarDto carDto);
    Mono<Void> deleteCar(Integer carId);
    Flux<CarDto> getAllCars();




}
