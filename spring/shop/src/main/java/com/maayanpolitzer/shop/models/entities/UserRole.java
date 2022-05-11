package com.maayanpolitzer.shop.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "user_roles")
@Getter
@Setter
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private String userId;

    private String role;

}
