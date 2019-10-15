package br.com.petshop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name="payment")
public class Payment {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name="tipo_pagamento")
    private String paymentType;

    @Column(name="valor")
    private double valor;

    @Column(name="data_pagamento")
    private LocalDateTime date;

    @Column(name="pataz")
    private Long pataz;

    @Column(name="nota")
    private Long nota;

}
