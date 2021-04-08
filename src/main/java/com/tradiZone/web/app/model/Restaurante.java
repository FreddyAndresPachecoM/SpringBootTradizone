/**
 * 
 */
package com.tradiZone.web.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author ghost
 *
 */
@Document(collection = "Restaurantes")
public class Restaurante {

	@Id
	private String id;
	private String nombreRestaurante;
	@Indexed(direction = IndexDirection.ASCENDING)
	private boolean estado;
	private String telefono;
	private Cuenta cuenta;
	private List<Local> locales;
	
	public Restaurante(String nombreRestaurante, boolean estado, String telefono, Cuenta cuenta, List<Local> locales) {
		this.nombreRestaurante=nombreRestaurante;
		this.estado=estado;
		this.telefono=telefono;
		this.cuenta=cuenta;
		this.locales=locales;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNombreRestaurante() {
		return nombreRestaurante;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}
	
	public List<Local> getLocales() {
		return locales;
	}
	
}
