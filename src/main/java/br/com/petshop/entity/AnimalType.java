package br.com.petshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Entity(name="tipo_animal")
public class AnimalType {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name="tipo")
    private String type;

    @OneToOne(mappedBy = "animalType")
    @JsonIgnore
    private Animal user;

}
