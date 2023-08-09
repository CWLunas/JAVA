package com.colin.DojosNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colin.DojosNinjas.models.Dojo;
import com.colin.DojosNinjas.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}