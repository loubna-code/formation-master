package com.zenithsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zenithsoft.model.Groupe;
@Repository
public interface groupeRepository extends CrudRepository<Groupe, Long>{
	
	
	
}
