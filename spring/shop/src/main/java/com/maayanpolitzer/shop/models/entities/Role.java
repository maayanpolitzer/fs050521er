package com.maayanpolitzer.shop.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "roles")
public class Role {

    @Id
    private String id;

    private String name;

}
