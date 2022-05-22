package com.maayanpolitzer.shop.controllers.authenticated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shops/{shopId}")
public class ShopController {

    @PreAuthorize("hasAuthority('OP_VIEW_REPORTS') and authentication.principal.shops.contains(#shopId)")
    @PostAuthorize("returnObject.body == authentication.principal.username")
    @GetMapping
    public ResponseEntity getShopReports(
            @PathVariable String shopId
    ){
        System.out.println("getShopReports worked!");
        return new ResponseEntity("user", HttpStatus.OK);
    }

}















