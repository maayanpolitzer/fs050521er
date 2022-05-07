package com.maayanpolitzer.shop.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
//    private User userId;

    private float price;

    @Column(name = "created_at", insertable = false, nullable = false)
    @UpdateTimestamp
    private Date createdAt;

    @Column(name = "order_submitted", insertable = false)
    private boolean orderSubmitted;

}
