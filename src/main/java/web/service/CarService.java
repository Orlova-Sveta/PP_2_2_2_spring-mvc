package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
  public List<Car> getListCar(){
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("Anton", "Audi", 3321));
    cars.add(new Car("Kiril", "Mazda", 1981));
    cars.add(new Car("Anna", "Toyota", 2754));
    cars.add(new Car("Maxim", "Camry", 3528));
    cars.add(new Car("Nikita", "Tesla", 9725));
    return cars;
  }
}