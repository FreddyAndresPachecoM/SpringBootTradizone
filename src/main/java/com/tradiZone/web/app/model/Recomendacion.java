package com.tradiZone.web.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Recomendaciones")
public class Recomendacion {

	@Id
	private String id;
	private int rating;
	private boolean aprovacion;
	private String nombreUsuario;
	
	public Recomendacion(int rating, boolean aprovacion, String nombreUsuario) {
		this.rating=rating;
		this.aprovacion=aprovacion;
		this.nombreUsuario=nombreUsuario;
	}
	
	public String getId() {
		return id;
	}
	
	public int getRating() {
		return rating;
	}
	
	public boolean isAprovacion() {
		return aprovacion;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
}
