package br.com.petshop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name="veterinario")
public class Veterinary {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "crm")
    private String crm;

}
