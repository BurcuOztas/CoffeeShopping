package com.example.burcuoztas.demo.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="BEVERAGE")
@Data


public class Beverage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    //@ApiModelProperty(value = "id field of beverage object")
    private int id;

    @Column(name = "NUMBER")
    //@ApiModelProperty(value = "Number field of beverage object")
    private int number;

    @Column(name = "NAME")
    //@ApiModelProperty(value = "Name field of beverage object")
    private String name;

    @Column(name = "PRICE")
    //@ApiModelProperty(value = "Price field of beverage object")
    private int price;

    @Column(name = "INCLUDING")
    //@ApiModelProperty(value = "Content field of beverage object")
    private String including;


}
