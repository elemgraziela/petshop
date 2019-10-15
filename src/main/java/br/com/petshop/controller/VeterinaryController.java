package br.com.petshop.controller;

import br.com.petshop.entity.Veterinary;
import br.com.petshop.service.VeterinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/veterinarians")
public class VeterinaryController {

    @Autowired
    private VeterinaryService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<Veterinary>> findAll() {
        Set<Veterinary> veterinarians = service.findAll();
        return new ResponseEntity<>(veterinarians, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Veterinary> findById(@PathVariable final Long id) {
        Veterinary veterinary = service.findById(id);
        return new ResponseEntity<>(veterinary, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Veterinary> save(@RequestBody final Veterinary veterinary) {
        return new ResponseEntity<>(service.save(veterinary), HttpStatus.OK);
    }

}
