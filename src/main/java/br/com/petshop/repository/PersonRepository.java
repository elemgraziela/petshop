package br.com.petshop.repository;

import br.com.petshop.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PersonRepository extends CrudRepository<Person, Long> {

    @Override
    Set<Person> findAll();

    Set<Person> findByPersonType(Long personType);
}
