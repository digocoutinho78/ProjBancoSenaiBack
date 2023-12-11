package com.api.senai.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.http.HttpStatus;
import com.api.senai.entities.Transacao;
import com.api.senai.services.TransacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping({"/transacao"}) // mapeia o endereco
public class TransacaoController {

// copiado exercicio

 @Autowired
    private TransacaoService transacaoService;

    @GetMapping
    public ResponseEntity<List<Transacao>> getAllTransacao(){
        
        List<Transacao> transacao = transacaoService.getAllTransacao();

        if(!transacao.isEmpty()) {
            return new ResponseEntity<>(transacao, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(transacao, HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Transacao> getTransaocaoById(@PathVariable Long id){
        
        Transacao transacao = transacaoService.getTransacaoById(id);

        if (transacao != null){
            return new ResponseEntity<>(transacao, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(transacao, HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity<Transacao> saveTransacao(@RequestBody Transacao novaTransacao){

        Transacao transacao = transacaoService.saveTransacao(novaTransacao);
        return ResponseEntity.ok(transacao);
    }
    // @PutMapping("/{id}")
    // public ResponseEntity<Cliente> updateCliente (@RequestBody Cliente clienteAtualizado, @PathVariable Long id) {

    //     Cliente cliente = clienteService.getClienteById(id);
    //     if (cliente != null){
    //         Cliente clienteNovo = clienteService.updateCliente(id, clienteAtualizado);
    //         return new ResponseEntity<>(clienteNovo, HttpStatus.OK);
    //     } else {
    //         return new ResponseEntity<>(cliente, HttpStatus.NOT_FOUND);
    //     }
    // }
    @DeleteMapping("/{id}")
    public ResponseEntity<Transacao> deleteTransacao(@PathVariable Long id){

        Transacao transacao = transacaoService.getTransacaoById(id);
        
        if (transacao != null){
            transacaoService.deleteTransacao(id);
            return new ResponseEntity<>(transacao, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(transacao, HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Transacao> logicalDeleteTransacao(@PathVariable Long id){

        Transacao transacao = transacaoService.getTransacaoById(id);
        
        if (transacao != null){
            transacaoService.logicalDeleteTransacao(id);
            return new ResponseEntity<>(transacao, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(transacao, HttpStatus.NOT_FOUND);
        }
    }


    
}