package com.maayanpolitzer.shop.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderDTO {

    private String id;

    private String userId;

    private float price;

    private Date createdAt;

    private boolean orderSubmitted;

}
