package com.maayanpolitzer.shop.models.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
public class User {

    @Id
    private String id;

    private String firstName;

    private String lastName;

//    @OneToOne
//    @JoinColumn(name = "address_id")
//    private Address address;

//    @OneToMany
//    private List<Role> roles;


}
