package com.maayanpolitzer.shop.services.interfaces;

import com.maayanpolitzer.shop.models.dto.PaymentDTO;
import org.springframework.stereotype.Service;


public interface IPaymentService {

    PaymentDTO pay(PaymentDTO paymentDTO);

}


