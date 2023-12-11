package com.api.senai.services;

<<<<<<< HEAD
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
  
=======
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
>>>>>>> b18d1cb012df0f4a776a9feb73b4536230a0eaef
}