package br.com.petshop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "produto")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name="fabricante")
    private String manufacturer;

    @Column(name="descricao")
    private String description;

    @Column(name = "tipo")
    private String type;

    @Column(name = "valor")
    private Double value;
}
