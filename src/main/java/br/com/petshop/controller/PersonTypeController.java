package br.com.petshop.controller;

import br.com.petshop.entity.PersonType;
import br.com.petshop.service.PersonTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/person-types")
public class PersonTypeController {

    @Autowired
    private PersonTypeService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<PersonType>> findAll() {
        Set<PersonType> personTypes = service.findAll();
        return new ResponseEntity<>(personTypes, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<PersonType> findById(@PathVariable final Long id) {
        PersonType personType = service.findById(id);
        return new ResponseEntity<>(personType, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<PersonType> save(@RequestBody final PersonType personType) {
        return new ResponseEntity<>(service.save(personType), HttpStatus.OK);
    }

}
