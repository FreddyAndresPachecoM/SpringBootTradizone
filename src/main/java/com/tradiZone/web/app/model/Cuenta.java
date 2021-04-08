/**
 * 
 */
package com.tradiZone.web.app.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ghost
 *
 */
@Document(collection = "Cuentas")
public class Cuenta {

	@Id
	private String id;
	private String nombreUsuario;
	private String passwordUsuario;
	private boolean estado;
	private Binary imagen;
	private Usuario usuario;
	
	
	public Cuenta(String nombreUsuario, String passwordUsuario, boolean estado, Binary imagen, Usuario usuario) {
		this.nombreUsuario=nombreUsuario;
		this.passwordUsuario=passwordUsuario;
		this.estado=estado;
		this.imagen=imagen;
		this.usuario=usuario;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public String getPasswordUsuario() {
		return passwordUsuario;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public Binary getImagen() {
		return imagen;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
}
