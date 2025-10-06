package auto_marketplace.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    private Long id;
    private String title;
    private String type;
    private String brand;
    private String model;
    private int year;
    private double price;
    private String location;
    private String description;

}
