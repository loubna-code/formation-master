package com.zenithsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zenithsoft.model.Produit;
import com.zenithsoft.repository.ProduitRepository;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable String name) {
		return "hello : "+name;
	}
	@RequestMapping(value = "/produit", method = RequestMethod.POST)
	public Produit getProduit() {
		Produit produit = new Produit();
		produit.setDescription("description");
		produit.setSerialNumber("serial 101");
		return produitRepository.save(produit);
	}
}
