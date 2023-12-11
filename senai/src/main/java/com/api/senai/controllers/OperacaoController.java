package com.api.senai.controllers;

import com.api.senai.entities.Operacao;
import com.api.senai.services.OperacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operacoes")
public class OperacaoController {

    private final OperacaoService operacaoService;

    @Autowired
    public OperacaoController(OperacaoService operacaoService) {
        this.operacaoService = operacaoService;
    }

    @GetMapping
    public ResponseEntity<List<Operacao>> getAllOperacoes() {
        List<Operacao> operacoes = operacaoService.getAllOperacoes();
        return new ResponseEntity<>(operacoes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Operacao> getOperacaoById(@PathVariable Long id) {
        Operacao operacao = operacaoService.getOperacaoById(id);
        return new ResponseEntity<>(operacao, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Operacao> createOperacao(@RequestBody Operacao operacao) {
        Operacao createdOperacao = operacaoService.createOperacao(operacao);
        return new ResponseEntity<>(createdOperacao, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Operacao> updateOperacao(@PathVariable Long id, @RequestBody Operacao operacao) {
        Operacao updatedOperacao = operacaoService.updateOperacao(id, operacao);
        return new ResponseEntity<>(updatedOperacao, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOperacao(@PathVariable Long id) {
        operacaoService.deleteOperacao(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}