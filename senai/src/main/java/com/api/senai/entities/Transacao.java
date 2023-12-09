package com.api.senai.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public abstract class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TransacaoId;
    private LocalDateTime dataHora;

    }


