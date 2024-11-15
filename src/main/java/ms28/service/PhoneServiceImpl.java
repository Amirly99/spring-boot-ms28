package ms28.service;

import lombok.RequiredArgsConstructor;
import ms28.model.Phone;
import ms28.repository.PhoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService {
    private final PhoneRepository phoneRepository;


    @Override
    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public Phone findById(Long id) {
        return null;
    }

    @Override
    public List<Phone> findAll() {
        return null;
    }
}
