package com.example.webfluxcrud.services.impl;

import com.example.webfluxcrud.controller.dto.CarDto;
import com.example.webfluxcrud.repository.CarRepository;
import com.example.webfluxcrud.repository.entity.CarEntity;
import com.example.webfluxcrud.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CarServiceimpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public Mono<CarDto> getCar(Integer carId) {
        return carRepository.findById(carId)
                .map(carEntity -> new CarDto(carEntity.getId(), carEntity.getBrand(), carEntity.getKilowatt()));
    }

    @Override
    public Mono<CarDto> createCar(CarDto carDto) {
        return carRepository.save(CarEntity.builder().brand(carDto.brand()).Kilowatt(carDto.Kilowatt()).build()).map(carEntity -> new CarDto(carEntity.getId(),carEntity.getBrand(),carEntity.getKilowatt()));
    }

    @Override
    public Mono<CarDto> updateCar(Integer carId, CarDto carDto) {
        return carRepository.save(CarEntity.builder().id(carId).brand(carDto.brand()).Kilowatt(carDto.Kilowatt()).build()).map(carEntity -> new CarDto(carEntity.getId(),carEntity.getBrand(),carEntity.getKilowatt()));
    }

    @Override
    public Mono<Void> deleteCar(Integer carId) {
        return carRepository.deleteById(carId);
    }

    @Override
    public Flux<CarDto> getAllCars() {
        return carRepository.findAll().map(carEntity -> new CarDto(carEntity.getId(),carEntity.getBrand(),carEntity.getKilowatt()));
    }
}
