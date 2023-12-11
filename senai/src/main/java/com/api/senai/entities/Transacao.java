package com.api.senai.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.api.senai.repositories.enums.TipoTransacao;

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

@Data
@Entity
public abstract class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TransacaoId;
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



    }


