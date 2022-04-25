package com.maayanpolitzer.shop.models.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {

    private String id;
    private String name;
    private String description;
    private float pricePerUnit;

}
