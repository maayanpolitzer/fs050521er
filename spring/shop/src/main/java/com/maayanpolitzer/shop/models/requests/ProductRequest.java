package com.maayanpolitzer.shop.models.requests;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ProductRequest {

    @NotBlank(message = "Product name must be provided")
    private String name;

    private String description;

    @Min(value = 1, message = "price must be larger than 1")
    @Max(value = 1000000, message = "price must be less than 1,000,000")
    private float pricePerUnit;

    private int stockAmount;

}
