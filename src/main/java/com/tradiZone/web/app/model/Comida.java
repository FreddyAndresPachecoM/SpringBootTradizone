/**
 * 
 */
package com.tradiZone.web.app.model;

import java.util.List;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ghost
 *
 */
@Document(collection = "Comida")
public class Comida {
	
	@Id
	private String id;
	private String nombre;
	@Indexed(direction = IndexDirection.ASCENDING)
	private String ingredientes;
	private String preparacion;
	private String historia;
	private boolean estado;
	private double precio;
	private Binary imagen;
	private Restaurante restaurante;
	private List<CategoriaComida> categorias;
	private List<Recomendacion> recomendaciones;
	
	public Comida(String nombre, String ingredientes, String preparacion, String historia, boolean estado, 
			double precio, Binary imagen, Restaurante restaurante, List<CategoriaComida> categorias, List<Recomendacion> recomendaciones) {
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		this.preparacion=preparacion;
		this.historia=historia;
		this.estado=estado;
		this.precio=precio;
		this.imagen=imagen;
		this.restaurante=restaurante;
		this.categorias=categorias;
		this.recomendaciones=recomendaciones;
	}
	
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public String getPreparacion() {
		return preparacion;
	}
	public String getHistoria() {
		return historia;
	}
	public boolean isEstado() {
		return estado;
	}
	public double getPrecio() {
		return precio;
	}
	public Binary getImagen() {
		return imagen;
	}
	public Restaurante getRestaurante() {
		return restaurante;
	}	
	public List<CategoriaComida> getCategorias() {
		return categorias;
	}
	public List<Recomendacion> getRecomendaciones() {
		return recomendaciones;
	}
}
