package br.com.petshop.service;

import br.com.petshop.entity.Animal;
import br.com.petshop.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public Set<Animal> findAll() {
        return repository.findAll();
    }

    public Animal findById(Long id) {
        return repository.findOne(id);
    }

    public Animal save(Animal animal) {
        return repository.save(animal);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}
