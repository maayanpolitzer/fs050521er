package com.maayanpolitzer.shop.util.helperClasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpMethod;

@Getter
@Setter
@AllArgsConstructor
public class PermitRoutePair {

    private HttpMethod method;
    private String route;

}
