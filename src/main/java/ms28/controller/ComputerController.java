package ms28.controller;

import lombok.RequiredArgsConstructor;
import ms28.model.Computer;
import ms28.service.ComputerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/comp")
public class ComputerController {

    private final ComputerService computerService;
    @GetMapping(value = "/{id}")
    public Computer getComp(@PathVariable Long id){

        return computerService.getComp(id);
    }

    @PostMapping(value = "/create")
    public Computer save(@RequestBody Computer computer){
        return computerService.save(computer);
    }

}
