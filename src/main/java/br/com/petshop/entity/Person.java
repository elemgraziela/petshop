package br.com.petshop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;


@Getter
@Setter
@Entity(name="pessoa")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name="cpf")
    private String cpf;

    @Column(name="rg")
    private String rg;

    @Column(name="email")
    private String email;

    @Column(name="nome")
    private String name;

    @Column(name="endereco")
    private String address;

    @Column(name="telefone")
    private String phone;

    @Column(name="pataz")
    private Integer pataz;

    @Column(name="id_tipo_pessoa")
    private Long personType;

    @Column(name="id_veterinario")
    private Integer veterinary;
}
