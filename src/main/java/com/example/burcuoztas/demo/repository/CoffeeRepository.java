package com.example.burcuoztas.demo.repository;

import com.example.burcuoztas.demo.entity.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Beverage,Integer> {

    Beverage findByNumber(int number);
}
