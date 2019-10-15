package br.com.petshop.service;

import br.com.petshop.entity.PersonType;
import br.com.petshop.repository.PersonTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonTypeService {
    @Autowired
    private PersonTypeRepository repository;

    public Set<PersonType> findAll() {
        return repository.findAll();
    }

    public PersonType findById(Long id) {
        return repository.findOne(id);
    }

    public PersonType save(PersonType personType) {
        return repository.save(personType);
    }

}
