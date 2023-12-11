package com.api.senai.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.api.senai.entities.Transacao;
import com.api.senai.enums.TipoTransacao;
import com.api.senai.services.TransacaoService;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @GetMapping
    public ResponseEntity<List<Transacao>> getAllTransacoes() {
        List<Transacao> transacoes = transacaoService.getAllTransacoes();
        return transacoes.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(transacoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transacao> getTransacaoById(@PathVariable Long id) {
        Transacao transacao = transacaoService.getTransacaoById(id);
        return transacao != null ? ResponseEntity.ok(transacao) : ResponseEntity.notFound().build();
    }

    @PostMapping("/realizar")
    public ResponseEntity<Transacao> realizarTransacao(@RequestBody Transacao transacao) {
        Transacao novaTransacao = transacaoService.realizarTransacao(transacao.getTransacaoId(), transacao.getOrigem(),
                transacao.getDestino(), transacao.getValor(), transacao.getTipo());
        return ResponseEntity.status(HttpStatus.CREATED).body(novaTransacao);
    }
}