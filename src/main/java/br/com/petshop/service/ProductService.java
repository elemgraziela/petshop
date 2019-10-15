package br.com.petshop.service;

import br.com.petshop.entity.Product;
import br.com.petshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Set<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findOne(id);
    }

    public Product save(Product prod) {
        return repository.save(prod);
    }

}
