package com.maayanpolitzer.shop.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDTO {
        private String cardNumber;
        private String cvv;
        private String cardOwner;
        private String exMonth;
        private String exYear;
        private float price;
        private int paymentsAmount;
        private boolean success;
        private String error;
        private String transactionId;

}
