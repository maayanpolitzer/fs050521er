package com.maayanpolitzer.shop.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name = "authorities")
@Getter
@Setter
public class Authority implements GrantedAuthority {

    @Id
    private int id;

    private String name;

    @ManyToMany(mappedBy = "authorities")
    private List<Role> roles;

    @Override
    public String getAuthority() {
        return name;
    }
}
