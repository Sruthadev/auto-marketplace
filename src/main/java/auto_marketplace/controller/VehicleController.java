package auto_marketplace.controller;

import auto_marketplace.model.Vehicle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final List<Vehicle> cars = new ArrayList<>(
            Arrays.asList(
                    new Vehicle(1L, "VRS for sale", "car", "Skoda", "Octavia VRS", 2017, 3000000, "Kochi, Kerala", "Octavia VRS for sale"),
                    new Vehicle(2L, "Polo for sale", "car", "VW", "Polo", 2020, 900000, "Kozhikode, Kerala", "Neat Polo for sale")
            )
    );

    private final List<Vehicle> bikes = new ArrayList<>(
            Arrays.asList(
                    new Vehicle(50L, "RX100 for sale", "bike", "Yamaha", "RX100", 1993, 100000, "Kozhikode, Kerala", "RX100 neat and clean for sale"),
                    new Vehicle(51L, "BMW 1200GS", "bike", "BMW", "GS1200", 2023, 1800000, "Malappuram, Kerala", "GS 1200 Adventure bike for sale")
            )
    );

    @GetMapping("/cars")
    public List<Vehicle> getAllCars() {
        return cars;
    }

    @GetMapping("/bikes")
    public List<Vehicle> getAllBikes() {
        return bikes;
    }
}
