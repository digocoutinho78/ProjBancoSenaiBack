package com.api.senai.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.api.senai.enums.TipoTransacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import jakarta.persistence.ForeignKey;

@Entity
public abstract class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transacaoId;

    private LocalDateTime dataHora;
    private TipoTransacao tipo;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "transacao", foreignKey = @ForeignKey(name = "transacao_fkey"))
    private Transacao transacao;

    @OneToOne
    @JoinColumn(name = "conta_cliente", foreignKey = @ForeignKey(name = "conta_cliente_fkey"))
    private Cliente cliente;

    @OneToMany(mappedBy = "origem")
    private List<Transacao> origem;

    @OneToMany(mappedBy = "destino")
    private List<Transacao> Destino;

    public Transacao() {

    }

    public Transacao(Long transacaoId, List origem, List destino, BigDecimal valor, LocalDateTime dataHora,
            TipoTransacao tipo) {
        this.transacaoId = transacaoId;
        this.origem = origem;
        Destino = destino;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
        this.tipo = tipo;
    }

}
