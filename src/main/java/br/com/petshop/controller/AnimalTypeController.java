package br.com.petshop.controller;

import br.com.petshop.entity.AnimalType;
import br.com.petshop.service.AnimalTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/animal-types")
@CrossOrigin(origins = "http://localhost:4200")
public class AnimalTypeController {

    @Autowired
    private AnimalTypeService service;

    //@ApiOperation(value = "Retrieves a set of all animal types")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<AnimalType>> findAll() {
        Set<AnimalType> animalTypes = service.findAll();
        return new ResponseEntity<>(animalTypes, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<AnimalType> findById(@PathVariable final Long id) {
        AnimalType animalType = service.findById(id);
        return new ResponseEntity<>(animalType, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<AnimalType> save(@RequestBody final AnimalType animalType) {
        return new ResponseEntity<>(service.save(animalType), HttpStatus.OK);
    }

}
