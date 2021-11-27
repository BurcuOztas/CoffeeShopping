package com.example.burcuoztas.demo.service.impl;

import com.example.burcuoztas.demo.dto.CoffeeDto;
import com.example.burcuoztas.demo.entity.Beverage;
import com.example.burcuoztas.demo.repository.CoffeeRepository;
import com.example.burcuoztas.demo.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    @Autowired
    CoffeeRepository coffeeRepository;

    @Override
    public CoffeeDto getDes(int number) {
        Beverage beverage = null;
        CoffeeDto coffeeDto = new CoffeeDto();

        try {
            beverage = coffeeRepository.findByNumber(number);
            if (beverage != null) {
                coffeeDto.setName(beverage.getName());
                coffeeDto.setIncluding(beverage.getIncluding());
            } else {
                coffeeDto.setName("Number not exist");
            }

            System.out.println("Teşekkürler kahveniz hazırlanıyor");
            System.out.println("Seçtiğiniz kahve=" + " " + coffeeDto.getName());
            System.out.println("Kahvenizin içeriği:"+ " " + coffeeDto.getIncluding());

            return coffeeDto;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<CoffeeDto> getAllList() {

        try {
            List<Beverage> list = coffeeRepository.findAll();
            List<CoffeeDto> coffeeDtoList = new ArrayList<>();
            for (Beverage beverage : list) {
                CoffeeDto coffeeDto = new CoffeeDto();
                coffeeDto.setName(beverage.getName());
                coffeeDto.setNumber(beverage.getNumber());
                coffeeDto.setPrice(beverage.getPrice());
                coffeeDtoList.add(coffeeDto);
                System.out.println("");
                System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz" + "Coffee name =" + coffeeDto.getName() + " Coffee Number" + coffeeDto.getNumber()
                        + " Coffee price" + coffeeDto.getPrice());
            }
            return coffeeDtoList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
