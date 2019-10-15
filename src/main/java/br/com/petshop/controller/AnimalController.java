package br.com.petshop.controller;

import br.com.petshop.entity.Animal;
import br.com.petshop.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/animals")
@CrossOrigin(origins = "http://localhost:4200")
public class AnimalController {

    @Autowired
    private AnimalService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<Animal>> findAll() {
        Set<Animal> animals = service.findAll();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Animal> findById(@PathVariable final Long id) {
        Animal animal = service.findById(id);
        return new ResponseEntity<>(animal, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Animal> save(@RequestBody final Animal animal) {
        return new ResponseEntity<>(service.save(animal), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable final Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
