package com.api.senai.services;

import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.senai.entities.Conta;
import com.api.senai.entities.Operacao;
import com.api.senai.entities.Transacao;
import com.api.senai.repositories.ContaRepository;
import com.api.senai.repositories.TransacaoRepository;

@Service
public class TransacaoService {

    @Autowired
    private ContaRepository contaRepository;



    @Autowired
    private TransacaoRepository transacaoRepository;

   

    public List<Transacao> getAllTransacao(){
        List<Transacao> transacao = transacaoRepository.findAll();

        return transacao;
    }
    public Transacao getTransacaoById(Long id){

        Transacao transacao = transacaoRepository.findById(id).orElse(null);

        return transacao;
    }
    public Transacao saveTransacao(Transacao novaTransacao){

        Transacao transacao = transacaoRepository.save(novaTransacao);
        return transacao;
    }
    public Transacao updateTransacao(Long id, Transacao transacaoAtualizada){
        
        Transacao transacaoExistente = getTransacaoById(id);
        // transacaoExistente.setAllAtributos(transacaoAtualizada);
        saveTransacao(transacaoExistente);
        
        return transacaoExistente;
    }
  
}