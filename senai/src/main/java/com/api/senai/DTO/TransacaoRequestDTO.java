package com.api.senai.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.api.senai.Enums.TipoTransacao;
import com.api.senai.entities.Conta;
import com.api.senai.entities.Transacao;

public class TransacaoRequestDTO {
    
    public Long id;

    public Conta origem;

    public Conta destino;

    public BigDecimal valor; 

    public LocalDateTime dataHora;

    public TipoTransacao tipo;


    public Transacao map() {
        Transacao transacao = new Transacao(id, origem, destino, valor, dataHora, tipo);
         
        return transacao;
    }
}



