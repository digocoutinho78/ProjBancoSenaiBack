package com.api.senai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.senai.services.EmailService;

@RestController
@RequestMapping("/email")

//criar aqui os modelos deiversos de email para serem chamados

public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send")  // neste caso vai chamar com /email/send no thunder
    public String sendEmail (
        @RequestParam String to,
        @RequestParam String subject,
        @RequestParam String content 

    ){

        emailService.sendSimpleEmail(to,subject, content);
        return "Email enviado com sucesso";
    }

    //@requestparam - solicita o parametro
    
}
