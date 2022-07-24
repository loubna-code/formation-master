package com.zenithsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zenithsoft.model.Groupe;
import com.zenithsoft.service.groupeService;

@RestController
@RequestMapping(value = "/groupes")
public class Groupecontroller {
	@Autowired
	private groupeService GroupeService;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable<Groupe> findAllGroupes() {
		return GroupeService.findAllGroupes();
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Groupe findGroupeById(@PathVariable Long id) {
		return GroupeService.findGroupeById(id);
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Groupe saveGroupe(@RequestBody Groupe groupe) {
		return GroupeService.saveGroupe(groupe);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteProduit(@PathVariable("id") long id) {
		GroupeService.deletegroupe(id);
	}
	
}
