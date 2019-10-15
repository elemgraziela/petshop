package br.com.petshop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "servico")
public class ServiceDescription {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "descricao")
    private String description;

    @Column(name = "tipo")
    private String type;

    @Column(name = "valor")
    private double value;

    @Column(name = "tempo")
    private double time;
}
