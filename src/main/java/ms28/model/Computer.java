package ms28.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Computer {

    private Long id;
    private String hdd;
    private String ram;
    private String model;
    private String color;
    private int year;
    private boolean fingerPrint;
    private boolean bluetoothEnabled;
}
