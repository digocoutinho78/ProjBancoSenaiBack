package com.api.senai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.senai.Enums.TipoTransacao;
import com.api.senai.entities.Conta;
import com.api.senai.entities.Transacao;
import com.api.senai.repositories.TransacaoRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private ContaService contaService;

    public void realizarTransacao( Long id, Conta origem, Conta destino, BigDecimal valor, LocalDateTime dataHora, TipoTransacao tipo) {
        // Lógica para realizar a transação
        Transacao transacao = new Transacao(id, origem, destino, valor, dataHora, tipo);
        transacaoRepository.save(transacao);

        // Atualizar saldos das contas
        contaService.atualizarSaldo(id, origem, destino, valor, dataHora, tipo);
    }

    public void realizarTransacao(Transacao transacao) {
    }

    // Outros métodos do serviço, se necessário
}