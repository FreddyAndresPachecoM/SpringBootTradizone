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

import com.tradiZone.web.app.model.CategoriaComida;
import com.tradiZone.web.app.repository.CategoriaRepository;

@RestController
@RequestMapping("/Categorias")
public class CategoriaController {
	
	CategoriaRepository categoriaRepository;

	public CategoriaController(CategoriaRepository categoriaRepository) {
		super();
		this.categoriaRepository = categoriaRepository;
	}
	
	@GetMapping("/listar")
	public List<CategoriaComida> getAll(){
		List<CategoriaComida> categorias = this.categoriaRepository.findAll();
		return categorias;
	}
	
	@PutMapping("/crear")
	public void insert(@RequestBody CategoriaComida categoriaComida) {
		this.categoriaRepository.insert(categoriaComida);
	}
	
	@PostMapping("/actualizar")
	public void update(@RequestBody CategoriaComida categoriaComida) {
		this.categoriaRepository.save(categoriaComida);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable (value = "id") String id) {
		this.categoriaRepository.deleteById(id);
	}
}
