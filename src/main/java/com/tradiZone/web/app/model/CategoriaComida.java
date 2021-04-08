/**
 * 
 */
package com.tradiZone.web.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ghost
 *
 */
@Document(collection = "CategoriaComida")
public class CategoriaComida {

	@Id
	private String id;
	private String nombre;
	private String descripcion;
	
	public CategoriaComida(String nombre, String descripcion) {
		this.nombre=nombre;
		this.descripcion=descripcion;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}
