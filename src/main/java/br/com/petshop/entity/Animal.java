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
@Entity(name="animal")
public class Animal {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "raca")
    private String breed;

    @Column(name = "porte")
    private String size;

    @Column(name = "descricao")
    private String description;

    @Column(name = "habitos_gostos")
    private String habits;

    @Column(name = "alergias")
    private String allergy;

    @Column(name = "autorizacao")
    private String authorization;

    @OneToOne()
    @JoinColumn(name = "id_tipo_animal", referencedColumnName = "id")
    private AnimalType animalType;

}
