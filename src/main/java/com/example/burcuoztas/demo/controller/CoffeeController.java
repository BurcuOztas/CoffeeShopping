package com.example.burcuoztas.demo.controller;

import com.example.burcuoztas.demo.dto.CoffeeDto;
import com.example.burcuoztas.demo.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/coffee")
//@Api(value = "Coffee Shopping Api documentation")
public class CoffeeController {

    @Autowired
    CoffeeService coffeeService;

    @GetMapping(value = "/{number}")
    public CoffeeDto getDescription(@PathVariable int number) {
        return coffeeService.getDes(number);
    }

    @GetMapping(value = "/coffeeList")
    public List<CoffeeDto> getCoffeeList() {
        return coffeeService.getAllList();
    }


}
