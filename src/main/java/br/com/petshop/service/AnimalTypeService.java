package br.com.petshop.service;

import br.com.petshop.entity.AnimalType;
import br.com.petshop.repository.AnimalTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AnimalTypeService {

    @Autowired
    private AnimalTypeRepository repository;

    public Set<AnimalType> findAll() {
        return repository.findAll();
    }

    public AnimalType findById(Long id) {
        return repository.findOne(id);
    }

    public AnimalType save(AnimalType animalType) {
        return repository.save(animalType);
    }
}
