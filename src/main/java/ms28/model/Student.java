package ms28.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id//id 'lerin avtomatic yaradilmasi ucun istifade olunur;
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;//unique yeni id'ler tekrarlanmir;
    String name;
    String surname;
    String address;
    Boolean status;


}
