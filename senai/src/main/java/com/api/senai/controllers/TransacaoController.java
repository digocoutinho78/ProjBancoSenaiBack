package com.api.senai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.senai.DTO.TransacaoRequestDTO;
import com.api.senai.entities.Transacao;
import com.api.senai.services.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @PostMapping("/")
    public ResponseEntity<String> realizarTransacao(@RequestBody TransacaoRequestDTO request) {
        try {
        Transacao transacao = request.map();
        transacaoService.realizarTransacao(transacao);
        return ResponseEntity.ok("Transação realizada com sucesso");
    }catch (Exception e) {
        // Tratar exceção específica para transações inválidas
        return ResponseEntity.badRequest().body("Falha na transação: " + e.getMessage());
    }
    }

    // Outros métodos do controlador, se necessário
}

/*
@PostMapping("/")
public ResponseEntity<String> realizarTransacao(@RequestBody TransacaoRequestDTO request) {
   
        // Validar os dados antes de criar a transação
        validarDadosTransacao(request);

        // Mapear DTO para a entidade Transacao
        Transacao transacao = request.map();

        // Realizar a transação usando o serviço
        transacaoService.realizarTransacao(transacao);

        return ResponseEntity.ok("Transação realizada com sucesso");
    } catch
}

private void validarDadosTransacao(TransacaoRequestDTO request) {
    // Implementar lógica de validação, lançar TransacaoInvalidaException em caso de dados inválidos
    // Exemplo: verificar se as contas são válidas, se o valor é positivo, etc.
}
*/