package br.com.petshop.controller;

import br.com.petshop.entity.ServiceDescription;
import br.com.petshop.service.ServiceDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/services")
public class ServiceDescriptionController {

    @Autowired
    private ServiceDescriptionService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<ServiceDescription>> findAll() {
        Set<ServiceDescription> services = service.findAll();
        return new ResponseEntity<>(services, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ServiceDescription> findById(@PathVariable final Long id) {
        ServiceDescription services = service.findById(id);
        return new ResponseEntity<>(services, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ServiceDescription> save(@RequestBody final ServiceDescription service) {
        return new ResponseEntity<>(this.service.save(service), HttpStatus.OK);
    }

}
