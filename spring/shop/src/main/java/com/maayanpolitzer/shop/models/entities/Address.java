package com.maayanpolitzer.shop.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "addresses")
public class Address {

    @Id
    private String id;

    private String country;

    private String city;

    private String street;

    private int zipcode;

    private int number;

}
