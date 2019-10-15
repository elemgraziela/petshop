package br.com.petshop.repository;

import br.com.petshop.entity.ServiceDescription;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ServiceDescriptionRepository extends CrudRepository<ServiceDescription, Long> {

    Set<ServiceDescription> findAll();
}
