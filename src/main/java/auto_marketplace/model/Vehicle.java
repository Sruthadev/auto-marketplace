package auto_marketplace.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String title;
    private String brand;
    private String model;
    private int year;
    private double price;
    private String location;
    private String description;

}
