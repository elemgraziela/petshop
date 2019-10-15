package br.com.petshop.service;

import br.com.petshop.entity.ServiceDescription;
import br.com.petshop.repository.ServiceDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ServiceDescriptionService {

    @Autowired
    private ServiceDescriptionRepository repository;

    public Set<ServiceDescription> findAll() {
        return repository.findAll();
    }

    public ServiceDescription findById(Long id) {
        return repository.findOne(id);
    }

    public ServiceDescription save(ServiceDescription serviceDescription) {
        return repository.save(serviceDescription);
    }
}
