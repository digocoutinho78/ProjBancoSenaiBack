package com.api.senai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;



@Service
public class EmailService {


    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(String to, String subject, String content) {


        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("digcoutinho@gmail.com"); // email da configuração do application properties 
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);

        mailSender.send(message);

    }
    
}
