package auto_marketplace.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="BIKE")
@Data
@RequiredArgsConstructor
public class Bike extends Vehicle{

    private int engineCapacity;
    private String segment;
    private boolean hasABS;

}
