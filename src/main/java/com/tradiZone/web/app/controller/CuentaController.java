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

import com.tradiZone.web.app.model.Cuenta;
import com.tradiZone.web.app.repository.CuentaRepository;

@RestController
@RequestMapping("/Cuentas")
public class CuentaController {

	CuentaRepository cuentaRepository;
	
	public CuentaController(CuentaRepository cuentaRepository) {
		super();
		this.cuentaRepository = cuentaRepository;
	}

	@GetMapping("/listar")
	public List<Cuenta> getAll() {
		
		List<Cuenta> cuentas = this.cuentaRepository.findAll();
		
		return cuentas;
	}
	
	@PutMapping("/crear")
	public void insert(@RequestBody Cuenta cuenta) {
		this.cuentaRepository.insert(cuenta);
	}
	
	@PostMapping("/actualizar")
	public void update(@RequestBody Cuenta cuenta) {
		this.cuentaRepository.save(cuenta);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable (value = "id") String id) {
		this.cuentaRepository.deleteById(id);
	}
	
}
