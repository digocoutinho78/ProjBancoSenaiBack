package com.api.senai.controllers;

import com.api.senai.entities.Endereco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.senai.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    
    @Autowired
    EnderecoService enderecoService;
    
   
    @GetMapping
    public ResponseEntity<List<Endereco>> getAllEndereco() {
        List<Endereco> enderecos = enderecoService.getAllEndereco();
        return new ResponseEntity<>(enderecos, HttpStatus.OK);
    }
    
    @GetMapping("/buscarPorId/{id}")
    public Endereco buscarPorId(@PathVariable Long id) {
        return enderecoService.buscarPorId(id);
    }
                 
}
