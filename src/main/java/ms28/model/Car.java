package ms28.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {
    private String make;
    private String model;
    private String color;
    private String march;
    private int year;
    private float weight;
    private double payment;
    private boolean rearCamera;
}
