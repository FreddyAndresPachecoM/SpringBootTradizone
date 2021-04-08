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
@Document(collection = "Usuarios")
public class Usuario {
	@Id
	private String id;
	private String nombres;
	private String apellidos;
	private String correo;
	private String celular;
	
	public Usuario(String nombres, String apellidos, String correo, String celular) {
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.correo=correo;
		this.celular=celular;
	}
	
	public String getId() {
		return id;
	}
		
	public String getNombres() {
		return nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public String getCelular() {
		return celular;
	}
}
