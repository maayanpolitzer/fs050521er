package com.maayanpolitzer.shop.models.responses;

import lombok.Data;

import java.util.Date;

@Data
public class OrderResponse {

    private String id;

    private float price;

    private Date createdAt;

}
