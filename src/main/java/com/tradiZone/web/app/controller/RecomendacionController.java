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

import com.tradiZone.web.app.model.Recomendacion;
import com.tradiZone.web.app.repository.RecomendacionRepository;

@RestController
@RequestMapping("/Recomendaciones")
public class RecomendacionController {

	RecomendacionRepository recomendacionRepository;

	public RecomendacionController(RecomendacionRepository recomendacionRepository) {
		super();
		this.recomendacionRepository = recomendacionRepository;
	}
	
	@GetMapping("/listar")
	public List<Recomendacion> getAll(){
		List<Recomendacion> recomendaciones = this.recomendacionRepository.findAll();
		return recomendaciones;
	}
	
	@PutMapping("/crear")
	public void insert(@RequestBody Recomendacion recomendacion) {
		this.recomendacionRepository.insert(recomendacion);
	}
	
	@PostMapping("/actualizar")
	public void update(@RequestBody Recomendacion recomendacion) {
		this.recomendacionRepository.save(recomendacion);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable (value = "id") String id) {
		this.recomendacionRepository.deleteById(id);
	}
}
