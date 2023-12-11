package com.api.senai.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.senai.entities.Transacao;
import com.api.senai.enums.TipoTransacao;
import com.api.senai.repositories.TransacaoRepository;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    public List<Transacao> getAllTransacoes() {
        return transacaoRepository.findAll();
    }

    public Transacao getTransacaoById(Long id) {
        return transacaoRepository.findById(id).orElse(null);
    }

    public Transacao realizarTransacao(Long transacaoId, List<Transacao> origem, List<Transacao> destino, BigDecimal valor,
            TipoTransacao tipo) {
        Transacao transacao = new Transacao(transacaoId, origem, destino, valor, LocalDateTime.now(), tipo);
        return transacaoRepository.save(transacao);
    }

}
