package br.com.petshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name="tipo_pessoa")
public class PersonType {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name="descricao")
    private String description;

    /*@OneToOne(mappedBy = "personType")
    @JsonIgnore
    private Person person;*/

}
