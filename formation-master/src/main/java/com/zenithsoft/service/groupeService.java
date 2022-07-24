package com.zenithsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenithsoft.model.Groupe;
import com.zenithsoft.repository.groupeRepository;
@Service
public class groupeService {
	@Autowired
	private groupeRepository grouperepository;
	public Iterable<Groupe> findAllGroupes() {
		return grouperepository.findAll();
	}
	
	public Groupe findGroupeById(Long id) {
		return grouperepository.findById(id).get();
	}
	
	public Groupe saveGroupe(Groupe groupe) {
		return grouperepository.save(groupe);
	}
	public void deletegroupe(long id){
		grouperepository.deleteById(id);
	}
	
	
}
