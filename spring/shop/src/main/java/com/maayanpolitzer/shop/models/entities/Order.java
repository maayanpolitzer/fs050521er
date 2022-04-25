package com.maayanpolitzer.shop.models.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Order {

    @Id
    private String id;

    @Column(name = "customer_id")
    private String customerId;

    private float price;

    @Column(name = "created_at", insertable = false)
    private Date createdAt;

    @Column(name = "order_submmited", insertable = false)
    private boolean orderSubmmited;
    


}
