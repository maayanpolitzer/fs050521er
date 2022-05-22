package com.maayanpolitzer.shop.util.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class AuthenticatedUser {

    private String userId;

    private String username;

    private List<String> shops;

}
