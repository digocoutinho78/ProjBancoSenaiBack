package com.api.senai.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.api.senai.enums.*;
import com.api.senai.entities.Conta;
import com.api.senai.entities.Transacao;

public class TransacaoRequestDTO {

    public Long transacaoId;

    public List origem;

    public List destino;

    public BigDecimal valor; 

    public LocalDateTime dataHora;

    public TipoTransacao tipo;


    public Transacao map() {
           Transacao transacao = new Transacao( transacaoId, origem, destino, valor, dataHora, tipo) {
            
           };
        return transacao;
    }
}