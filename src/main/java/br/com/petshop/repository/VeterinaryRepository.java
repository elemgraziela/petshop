package br.com.petshop.repository;

import br.com.petshop.entity.Veterinary;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface VeterinaryRepository extends CrudRepository<Veterinary, Long> {

    Set<Veterinary> findAll();
}
