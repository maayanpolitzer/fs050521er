package com.maayanpolitzer.shop.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private String id;
    private String name;
    private String description;
    private float pricePerUnit;
    private int stockAmount;

}
