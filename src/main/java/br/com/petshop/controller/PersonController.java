package br.com.petshop.controller;

import br.com.petshop.entity.Person;
import br.com.petshop.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/people")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    @Autowired
    private PersonService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<Person>> findAll() {
        Set<Person> persons = service.findAll();
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> findById(@PathVariable final Long id) {
        Person person = service.findById(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Person> save(@RequestBody final Person person) {
        return new ResponseEntity<>(service.save(person), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable final Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(path = "search-by-person-type/{personType}", method = RequestMethod.GET)
    public ResponseEntity<Set<Person>> findByPersonType(@PathVariable final Long personType) {
        Set<Person> person = service.findByPersonType(personType);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

}
