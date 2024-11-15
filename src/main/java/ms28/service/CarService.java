package ms28.service;

import ms28.model.Car;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public Car getCar(Long id){

        return Car.builder()
                .year(2022)
                .weight(1.5f)
                .payment(2000d)
                .rearCamera(true)
                .build();
    }
}
