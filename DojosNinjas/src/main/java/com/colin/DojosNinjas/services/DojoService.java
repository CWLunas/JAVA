package com.colin.DojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.colin.DojosNinjas.models.Dojo;
import com.colin.DojosNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepository repo;
    
    public DojoService(DojoRepository repo) {
        this.repo = repo;
    }
    // returns all the dojos
    public List<Dojo> all() {
        return repo.findAll();
    }
    // creates a dojo
    public Dojo create(Dojo dojo) {
    	System.out.println(dojo.getId());
        return repo.save(dojo);
    }
    // retrieves a dojo
    public Dojo find(Long id) {
        Optional<Dojo> result = repo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
}