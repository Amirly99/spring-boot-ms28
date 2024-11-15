package ms28.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ms28.model.Phone;
import ms28.service.PhoneService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/phone")
public class PhoneController {
   private final PhoneService phoneService;
   @PostMapping(value = "/create")
   public Phone save(@RequestBody Phone phone){
      return phoneService.save(phone);
   }



}
