package ms28.service;

import ms28.model.Computer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ComputerService {
    private static Long ID = 1L;
    private static Map<Long, Computer> bookMap = new HashMap<>();
public  Computer getComp(Long id){
    return Computer.builder()
            .hdd("500GB")
            .ram("16GB")
            .bluetoothEnabled(true)
            .model("HP")
            .fingerPrint(true)
            .color("Black")
            .id(ID++)
            .year(2024).build();
}
public Computer save(Computer computer){
    return Computer.builder()
            .hdd("500GB")
            .ram("16GB")
            .bluetoothEnabled(true)
            .model("HP")
            .fingerPrint(true)
            .color("Black")
            .id(ID++)
            .year(2024).build();

}
}
