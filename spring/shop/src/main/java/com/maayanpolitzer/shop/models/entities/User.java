package com.maayanpolitzer.shop.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

@Entity(name = "users")
@Getter
@Setter
public class User implements UserDetails {

    @Id
    private String id;

    private String username;

    private String encryptedPassword;

    private String firstName;

    private String lastName;

    @Column(insertable = false)
    private Date updatePasswordAt;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Authority> authoritySet = new HashSet<>();
        for(Role role : roles){
            for(Authority authority : role.getAuthorities()){
                authoritySet.add(authority);
            }
//            if(!authoritySet.addAll(role.getAuthorities())){
//                System.out.println("Error 1");
//            }
        }
        return authoritySet;
    }

    @Override
    public String getPassword() {
        return encryptedPassword;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        Calendar updatePassword = Calendar.getInstance();
        updatePassword.setTime(updatePasswordAt);
        updatePassword.add(Calendar.MONTH, 3);
        Calendar now = Calendar.getInstance();
        boolean response = now.before(updatePassword);
        return response;
        /*
        Calendar now = Calendar.getInstance();
        now.add(Calendar.MONTH, 3);
        long threeMonthsFromNow = now.getTime().getTime();
        return updatePasswordAt.getTime() < threeMonthsFromNow;

         */
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
