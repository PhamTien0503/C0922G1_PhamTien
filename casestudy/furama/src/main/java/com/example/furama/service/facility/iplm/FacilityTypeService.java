package com.example.furama.service.facility.iplm;

import com.example.furama.model.customer.CustomerType;
import com.example.furama.model.facility.FacilityType;
import com.example.furama.repository.customer.ICustomerTypeRepository;
import com.example.furama.repository.facility.IFacilityTypeRepository;
import com.example.furama.service.customer.ICustomerTypeService;
import com.example.furama.service.facility.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.FacesWebRequest;

import java.util.List;
@Service
public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    private IFacilityTypeRepository facilityTypeRepository;
    @Override
    public List<FacilityType> findAll() {
        return facilityTypeRepository.findAll();
    }
}
