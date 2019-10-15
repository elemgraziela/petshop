package br.com.petshop.service;

import br.com.petshop.entity.Person;
import br.com.petshop.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Set<Person> findAll() {
        return repository.findAll();
    }

    public Person findById(Long id) {
        return repository.findOne(id);
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    public Set<Person> findByPersonType(Long personType) {
        return repository.findByPersonType(personType);
    }
}
