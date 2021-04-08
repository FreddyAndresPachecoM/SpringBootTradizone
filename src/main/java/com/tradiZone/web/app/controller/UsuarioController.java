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

import com.tradiZone.web.app.model.Usuario;
import com.tradiZone.web.app.repository.UsuarioRepository;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {
	
	private UsuarioRepository usuarioRepository;

	public UsuarioController(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}
	
	@GetMapping("/listar")
	public List<Usuario> getAll(){ 
		List<Usuario> usuarios = this.usuarioRepository.findAll();
		return usuarios;
	}
	
	@PutMapping("/crear")
	public void insert(@RequestBody Usuario usuario) {
		this.usuarioRepository.insert(usuario);
	}
	
	@PostMapping("/actualizar")
	public void update(@RequestBody Usuario usuario) {
		this.usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable(value = "id") String id) {
		this.usuarioRepository.deleteById(id);
	}
			
	
}
	
