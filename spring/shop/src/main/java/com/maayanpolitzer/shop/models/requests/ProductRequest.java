package com.maayanpolitzer.shop.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {

    private String name;
    private String description;
    private float pricePerUnit;
    private int stockAmount;

}
