package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarsService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping()
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = carsService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
