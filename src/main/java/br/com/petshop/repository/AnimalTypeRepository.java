package br.com.petshop.repository;

import br.com.petshop.entity.AnimalType;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AnimalTypeRepository extends CrudRepository<AnimalType, Long> {

    Set<AnimalType> findAll();

}
