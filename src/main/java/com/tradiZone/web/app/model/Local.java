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
@Document(collection = "Locales")
public class Local {

	@Id
	private String id;
	private String avPrincipal;
	private String avSecundaria;
	private String latitud;
	private String altitud;
	private boolean estado;
	private int capacidad;
	private String diasLaborables;
	private String horarioJornada;
	private Binary imagen;
	
	public Local(String avPrincipal, String avSecundaria, String latitud, String altitud, 
			boolean estado, int capacidad, String diasLaborables, String horarioJornada, Binary imagen) {
		
		this.avPrincipal=avPrincipal;
		this.avSecundaria=avSecundaria;
		this.latitud=latitud;
		this.altitud=altitud;
		this.estado=estado;
		this.capacidad=capacidad;
		this.diasLaborables=diasLaborables;
		this.horarioJornada=horarioJornada;
		this.imagen=imagen;
	}
	
	public String getId() {
		return id;
	}
	
	public String getAvPrincipal() {
		return avPrincipal;
	}
	
	public String getAvSecundaria() {
		return avSecundaria;
	}
	
	public String getLatitud() {
		return latitud;
	}
	
	public String getAltitud() {
		return altitud;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public String getDiasLaborables() {
		return diasLaborables;
	}
	
	public String getHorarioJornada() {
		return horarioJornada;
	}
	
	public Binary getImagen() {
		return imagen;
	}
}
