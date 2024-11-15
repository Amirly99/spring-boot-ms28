package ms28.repository;

import ms28.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
