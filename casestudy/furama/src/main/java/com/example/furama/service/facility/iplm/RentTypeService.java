package com.example.furama.service.facility.iplm;

import com.example.furama.model.customer.CustomerType;
import com.example.furama.model.facility.RentType;
import com.example.furama.repository.customer.ICustomerTypeRepository;
import com.example.furama.repository.facility.IRentTypeRepository;
import com.example.furama.service.customer.ICustomerTypeService;
import com.example.furama.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
    @Autowired
    private IRentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
