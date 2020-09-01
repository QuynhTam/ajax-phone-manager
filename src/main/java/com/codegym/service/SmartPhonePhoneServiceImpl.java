package com.codegym.service;

import com.codegym.model.SmartPhone;
import com.codegym.repository.SmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SmartPhonePhoneServiceImpl implements SmartPhoneService {
    @Autowired
    private SmartPhoneRepository smartPhoneRepository;

    @Override
    public Iterable<SmartPhone> findAll() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public SmartPhone findById(Integer id) {
        return smartPhoneRepository.findOne(id);
    }

    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return smartPhoneRepository.save(smartPhone);
    }

    @Override
    public SmartPhone delete(Integer id) {
        SmartPhone smartPhone = findById(id);
        smartPhoneRepository.delete(id);
        return smartPhone;
    }
}
