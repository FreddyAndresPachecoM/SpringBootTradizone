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

import com.tradiZone.web.app.model.Restaurante;
import com.tradiZone.web.app.repository.RestauranteRepository;

@RestController
@RequestMapping("/Restaurantes")
public class RestauranteController {

	RestauranteRepository restauranteRepository;

	public RestauranteController(RestauranteRepository restauranteRepository) {
		super();
		this.restauranteRepository = restauranteRepository;
	}
	
	@GetMapping("/listar")
	public List<Restaurante> getAll() {
		List<Restaurante> restaurantes = this.restauranteRepository.findAll();
		return restaurantes;
	}
	
	@PutMapping("/crear")
	public void insert(@RequestBody Restaurante restaurante) {
		this.restauranteRepository.insert(restaurante);
	}
	
	@PostMapping("/actualizar")
	public void update(@RequestBody Restaurante restaurante) {
		this.restauranteRepository.save(restaurante);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable (value = "id") String id) {
		this.restauranteRepository.deleteById(id);
	}
	
}
