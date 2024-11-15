package ms28.controller;

import lombok.RequiredArgsConstructor;
import ms28.model.Car;
import ms28.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/cars")
public class CarController {
    private final CarService carService;
    @GetMapping(value = "/{id}")
    public Car getCar(@PathVariable Long id){
        return carService.getCar(id);
    }
}
