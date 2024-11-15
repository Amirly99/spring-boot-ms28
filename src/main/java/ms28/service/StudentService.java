package ms28.service;

import ms28.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getStudent(Long id) {
        return Student.builder()
                .name("Ragib")
                .surname("Amirli")
                .address("Baku")
                .status(true)
                .build();
    }

}
