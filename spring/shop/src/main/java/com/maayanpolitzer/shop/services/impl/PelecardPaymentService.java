package com.maayanpolitzer.shop.services.impl;

import com.maayanpolitzer.shop.models.dto.PaymentDTO;
import com.maayanpolitzer.shop.services.interfaces.IPaymentService;
import org.springframework.stereotype.Service;

@Service
public class PelecardPaymentService implements IPaymentService {

    @Override
    public PaymentDTO pay(PaymentDTO paymentDTO) {
        System.out.println("pelecard payment");
        validateCardAndCreateToken();
        catchFrame();
        pay();
        return paymentDTO;
    }

    private void catchFrame(){

    }

    private void validateCardAndCreateToken(){

    }

    private void pay(){

    }

}
