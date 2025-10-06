package auto_marketplace.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="BIKE")
public class Bike extends Vehicle{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int engineCapacity;
    private String segment;
    private boolean hasABS;

}
