package com.api.senai.services;

import com.api.senai.entities.Operacao;
import com.api.senai.repositories.OperacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperacaoService {

    private final OperacaoRepository operacaoRepository;

    @Autowired
    public OperacaoService(OperacaoRepository operacaoRepository) {
        this.operacaoRepository = operacaoRepository;
    }

    public List<Operacao> getAllOperacoes() {
        return operacaoRepository.findAll();
    }

    public Operacao getOperacaoById(Long id) {
        Optional<Operacao> optionalOperacao = operacaoRepository.findById(id);
        return optionalOperacao.orElse(null);
    }

    public Operacao createOperacao(Operacao operacao) {
        // Lógica de validação ou processamento, se necessário
        return operacaoRepository.save(operacao);
    }

    public Operacao updateOperacao(Long id, Operacao operacao) {
        Optional<Operacao> optionalOperacao = operacaoRepository.findById(id);
        if (optionalOperacao.isPresent()) {
            // Atualiza os campos necessários
            Operacao existingOperacao = optionalOperacao.get();
            existingOperacao.setTipoOperacao(operacao.getTipoOperacao());
            existingOperacao.setValor(operacao.getValor());
            existingOperacao.setDataHora(operacao.getDataHora());
            existingOperacao.setOrigem(operacao.getOrigem());
            existingOperacao.setDestino(operacao.getDestino());

            // Lógica de validação ou processamento, se necessário

            return operacaoRepository.save(existingOperacao);
        } else {
            // Tratar quando a operação não existe
            return null;
        }
    }

    public void deleteOperacao(Long id) {
        operacaoRepository.deleteById(id);
    }
}