package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    List<Car> cars = List.of(
            new Car("BMW", "black", 2020),
            new Car("Audi", "white", 2021),
            new Car("Mercedes", "silver", 2022),
            new Car("Toyota", "blue", 2023),
            new Car("Kia", "red", 2024)
    );

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
