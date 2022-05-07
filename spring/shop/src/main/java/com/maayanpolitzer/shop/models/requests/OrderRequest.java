package com.maayanpolitzer.shop.models.requests;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class OrderRequest {

    @Min(value = 1, message = "price must be larger than 1")
    @Max(value = 1000000, message = "price must be less than 1,000,000")
    private float price;

}
