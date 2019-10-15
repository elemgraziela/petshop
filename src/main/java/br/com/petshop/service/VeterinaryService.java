package br.com.petshop.service;

import br.com.petshop.entity.Veterinary;
import br.com.petshop.repository.VeterinaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VeterinaryService {

    @Autowired
    private VeterinaryRepository repository;

    public Set<Veterinary> findAll() {
        return repository.findAll();
    }

    public Veterinary findById(Long id) {
        return repository.findOne(id);
    }

    public Veterinary save(Veterinary animalType) {
        return repository.save(animalType);
    }

}
