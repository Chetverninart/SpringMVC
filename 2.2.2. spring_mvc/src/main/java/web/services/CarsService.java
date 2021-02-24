package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Renault", "Logan"));
        cars.add(new Car(2, "Kia", "Rio"));
        cars.add(new Car(3, "VW", "Polo"));
        cars.add(new Car(4, "Tesla", "X"));
        cars.add(new Car(5, "Mercedes", "S63AMG"));
    }

    public List<Car> getCars(Integer count) {
        return (count == null || count > cars.size() ? cars : cars.subList(0, count));
    }

}
