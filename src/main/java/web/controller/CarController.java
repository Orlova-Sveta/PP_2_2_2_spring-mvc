package web.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
public class CarController {
  private final CarService carService;

  @Autowired
  public CarController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping("/cars")
  public String printCarList(@RequestParam(value = "count", required = false) Long count, ModelMap model) {
    List<Car> listCar = carService.getListCar();
    if (count != null) {
      listCar = listCar.stream().limit(count).collect(Collectors.toList());
    }
    model.addAttribute("carsList", listCar);
    return "car";
  }
}