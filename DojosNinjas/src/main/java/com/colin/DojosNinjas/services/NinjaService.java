package com.colin.DojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.colin.DojosNinjas.models.Dojo;
import com.colin.DojosNinjas.models.Ninja;
import com.colin.DojosNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired	
	private final NinjaRepository repo;
    
    public NinjaService(NinjaRepository repo) {
        this.repo = repo;
    }
    // returns all the ninjas
    public List<Ninja> all() {
        return repo.findAll();
    }
    // creates a ninja
    public Ninja create(Ninja ninja) {
        return repo.save(ninja);
    }
    // retrieves a ninja
    public Ninja find(Long id) {
        Optional<Ninja> result = repo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
    public List<Ninja> byDojo(Dojo dojo) {
    	return repo.findAllByDojo(dojo);
    }
}
