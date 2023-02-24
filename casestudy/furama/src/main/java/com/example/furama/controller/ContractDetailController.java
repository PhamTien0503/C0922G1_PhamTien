package com.example.furama.controller;

import com.example.furama.repository.contract.IContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContractDetailController {
    @Autowired
   private IContractDetailRepository contractDetailRepository;


}
