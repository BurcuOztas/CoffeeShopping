package com.example.burcuoztas.demo.service;

import com.example.burcuoztas.demo.dto.CoffeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CoffeeService {

    CoffeeDto getDes(int number);

    List<CoffeeDto> getAllList();

}
