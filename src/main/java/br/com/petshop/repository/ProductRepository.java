package br.com.petshop.repository;

import br.com.petshop.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Set<Product> findAll();

}