package com.pokemon.pokemon.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokemon.project.exception.ResourceNotFoundException;
import com.pokemon.pokemon.project.model.Dresseur;
import com.pokemon.pokemon.project.repository.DresseurRepository;

@RestController
@RequestMapping
public class DresseurController {
	
	@Autowired
	private DresseurRepository dresseurRepository;
	
	//GET READ
	
	@GetMapping("/dresseur")
	public List<Dresseur> getAllDresseur(){
		return this.dresseurRepository.findAll();
	}
	
	//GET READ BY ID
	
	@GetMapping("/dresseur/{id}")
    public ResponseEntity<Dresseur> getDresseurById(@PathVariable(value = "id") Long dresseurId)
    throws ResourceNotFoundException {
        Dresseur dresseur = dresseurRepository.findById(dresseurId)
                .orElseThrow(() -> new ResourceNotFoundException("Dresseur not found for this id :: " + dresseurId));
                return ResponseEntity.ok().body(dresseur);
    }
	

	//SAVE
	
	@PostMapping("/dresseur")
	public Dresseur createdresseur(@RequestBody Dresseur dresseur) {
		return this.dresseurRepository.save(dresseur);
	}
	
	//UPDATE
	
	@PutMapping("dresseur/{id}")
	public ResponseEntity<Dresseur> updateDresseur(@PathVariable(value = "id") Long dresseurId, 
			@RequestBody Dresseur dresseurDetails) throws ResourceNotFoundException {
		
		Dresseur dresseur = dresseurRepository.findById(dresseurId)
				.orElseThrow(() -> new ResourceNotFoundException("Dresseur not found for this id :: " + dresseurId));
		
		dresseur.setName_(dresseurDetails.getName_());
		dresseur.setVille(dresseurDetails.getVille());
		
		
		return ResponseEntity.ok(this.dresseurRepository.save(dresseur));
		
	}
	
	//DELETE
	
	@DeleteMapping("dresseur/{id}")
	public Map<String, Boolean> deleteDresseur(@PathVariable(value = "id") Long dresseurId) throws ResourceNotFoundException {
		Dresseur dresseur = dresseurRepository.findById(dresseurId)
                .orElseThrow(() -> new ResourceNotFoundException("Dresseur not found for this id :: " + dresseurId));
                
        this.dresseurRepository.delete(dresseur);
        
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        
        return response;
		
	}
	

}
