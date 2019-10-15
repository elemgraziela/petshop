package br.com.petshop.repository;

import br.com.petshop.entity.Animal;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AnimalRepository extends CrudRepository<Animal, Long> {

    @Override
    Set<Animal> findAll();
}
