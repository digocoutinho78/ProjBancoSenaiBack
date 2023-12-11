package com.api.senai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.senai.entities.Endereco;
import com.api.senai.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    EnderecoRepository enderecoRepository;

    public List<Endereco> getAllEndereco(){
        List<Endereco> endereco = enderecoRepository.findAll();

        return endereco;
    }
     
    public Endereco buscarPorId (Long id) {
        Endereco endereco = enderecoRepository.findById(id).orElse(null);
        return endereco;
    }
    
}
