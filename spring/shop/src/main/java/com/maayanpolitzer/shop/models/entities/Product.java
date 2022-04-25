package com.maayanpolitzer.shop.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "products")
@Getter
@Setter
public class Product {

    @Id
    private String id;

    private String name;

    private String description;

    @Column(name = "ppu")
    private float pricePerUnit;

    @Column(name = "stock_amount")
    private int stockAmount;

}
