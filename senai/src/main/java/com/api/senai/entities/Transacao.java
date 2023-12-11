package com.api.senai.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.api.senai.repositories.enums.TipoTransacao;

import com.api.senai.Enums.TipoTransacao;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import jakarta.persistence.ForeignKey;
=======
>>>>>>> b18d1cb012df0f4a776a9feb73b4536230a0eaef

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Conta origem;

    private Conta Destino;

    private BigDecimal valor; 

    private LocalDateTime dataHora;
    private TipoTransacao tipo;
   

    @ManyToOne
    @JoinColumn(name = "transacao", foreignKey = @ForeignKey(name = "transacao_fkey"))
    private Transacao transacao;
    
    @OneToOne
    @JoinColumn(name = "conta_cliente", foreignKey = @ForeignKey(name = "conta_cliente_fkey"))
    private Cliente cliente;
    
    @OneToMany(mappedBy = "origem")
    private List<Transacao> Origem;

    @OneToMany(mappedBy = "destino")
    private List<Transacao> Destino;



    private TipoTransacao tipo;

    public Long getId() {
        return id;
    }

    public Conta getOrigem() {
        return origem;
    }

    public void setOrigem(Conta origem) {
        this.origem = origem;
    }

    public Conta getDestino() {
        return Destino;
    }

    public void setDestino(Conta destino) {
        Destino = destino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public Transacao(Long id, Conta origem, Conta destino, BigDecimal valor, LocalDateTime dataHora,
            TipoTransacao tipo) {
        this.id = id;
        this.origem = origem;
        Destino = destino;
        this.valor = valor;
        this.dataHora = dataHora;
        this.tipo = tipo;
    }

    
}
