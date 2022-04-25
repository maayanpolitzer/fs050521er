package com.example.requestvalidation.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    // fix gmail issue in mailbox.

    public boolean sendEmail(String to, String subject, String body){
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setSubject("תודה שנרשמת למערכת השרת החזקה במדינה");
            message.setText(body);
            message.setFrom("maayanp163@gmail.com");
            javaMailSender.send(message);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
