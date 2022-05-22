package com.maayanpolitzer.shop.models.responses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class RoleResponse {

    private long id;

    private String name;

}
