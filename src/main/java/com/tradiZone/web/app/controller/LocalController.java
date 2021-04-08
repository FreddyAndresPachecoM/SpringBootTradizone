package com.tradiZone.web.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tradiZone.web.app.model.Local;
import com.tradiZone.web.app.repository.LocalRepository;

@RestController
@RequestMapping("/Locales")
public class LocalController {

	LocalRepository localRepository;

	public LocalController(LocalRepository localRepository) {
		super();
		this.localRepository = localRepository;
	}
	
	@GetMapping("/listar")
	public List<Local> getAll(){
		List<Local> locales = this.localRepository.findAll();
		return locales;
	}
	
	@PutMapping("/crear")
	public void insert(@RequestBody Local local) {
		this.localRepository.insert(local);
	}
	
	@PostMapping("/actualizar")
	public void update (@RequestBody Local local){
		this.localRepository.save(local);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable (value = "id") String id) {
		this.localRepository.deleteById(id);
	}
}
