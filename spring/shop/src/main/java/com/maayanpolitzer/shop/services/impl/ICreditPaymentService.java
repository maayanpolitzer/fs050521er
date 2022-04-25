package com.maayanpolitzer.shop.services.impl;

import com.maayanpolitzer.shop.models.dto.PaymentDTO;
import com.maayanpolitzer.shop.services.interfaces.IPaymentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ICreditPaymentService implements IPaymentService {
    @Override
    public PaymentDTO pay(PaymentDTO paymentDTO) {
        System.out.println("iCredit payment");
        return null;
    }
}
