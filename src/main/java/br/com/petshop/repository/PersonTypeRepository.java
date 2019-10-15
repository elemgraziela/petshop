package br.com.petshop.repository;

import br.com.petshop.entity.PersonType;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PersonTypeRepository extends CrudRepository<PersonType, Long> {

    Set<PersonType> findAll();
}
