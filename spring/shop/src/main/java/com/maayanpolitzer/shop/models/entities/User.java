package com.maayanpolitzer.shop.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
@Getter
@Setter
public class User {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<UserRole> roles;

}
