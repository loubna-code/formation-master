package com.zenithsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.zenithsoft.model.Produit;
import com.zenithsoft.service.ProduitService;
@RestController
@RequestMapping(value = "/produits")
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable<Produit> findAllProduits() {
		return produitService.findAllProduits();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Produit findProduitById(@PathVariable Long id) {
		return produitService.findProduitById(id);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Produit saveProduit(@RequestBody Produit produit) {
		return produitService.saveProduit(produit);
	}
	@PutMapping("/update/{id}")
	public void updateProduit(@RequestBody Produit produit,@PathVariable("id") long id) {
		produitService.updateProduit(produit, id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteProduit(@PathVariable("id") long id) {
		produitService.deleteProduit(id);
	}
	
}
