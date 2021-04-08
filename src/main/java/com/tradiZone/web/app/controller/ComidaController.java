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

import com.tradiZone.web.app.model.Comida;
import com.tradiZone.web.app.repository.ComidaRepository;

@RestController
@RequestMapping("/Comidas")
public class ComidaController {
	
	ComidaRepository comidaRepository;

	public ComidaController(ComidaRepository comidaRepository) {
		super();
		this.comidaRepository = comidaRepository;
	}
	
	@GetMapping("/listar")
	public List<Comida> getAll(){
		List<Comida> comidas = this.comidaRepository.findAll();
		return comidas;
	}
	
	@PutMapping("/crear")
	public void insert(@RequestBody Comida comida) {
		this.comidaRepository.insert(comida);
	}
	
	@PostMapping("/actualizar")
	public void update(@RequestBody Comida comida) {
		this.comidaRepository.save(comida);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable (value = "id") String id) {
		this.comidaRepository.deleteById(id);
	}
}
