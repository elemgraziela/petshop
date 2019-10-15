package br.com.petshop.controller;

import br.com.petshop.entity.Product;
import br.com.petshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<Product>> findAll() {
        Set<Product> products = service.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Product> findById(@PathVariable final Long id) {
        Product product = service.findById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Product> save(@RequestBody final Product product) {
        return new ResponseEntity<>(service.save(product), HttpStatus.OK);
    }

}
