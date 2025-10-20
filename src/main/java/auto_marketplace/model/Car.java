package auto_marketplace.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="CAR")
@Data
@RequiredArgsConstructor
public class Car extends Vehicle{

    private String fuelType;
    private String segment;
    private String transmission;
    private int bootCapacity;

}
