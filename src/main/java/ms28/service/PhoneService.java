package ms28.service;

import ms28.model.Phone;

import java.util.List;

public interface PhoneService {
    Phone save(Phone phone);
    Phone findById(Long id);
    List<Phone> findAll();
}
