package com.salesianostriana.dam.DiosFiestasGonzaloDemo.modelos;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class Expedicion {

	
	@Id	
	@GeneratedValue
	private long id;
	
	private String nombre;
	private double precio;
	private int categoria;
	private int capacidad;
	private LocalDate fechaExpedicion;
	private LocalDate fechaLimite;
	
	
	public Expedicion(String nombre, double precio, int capacidad, LocalDate fechaExpedicion, LocalDate fechaLimite) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.capacidad = capacidad;
		this.fechaExpedicion = fechaExpedicion;
		this.fechaLimite = fechaLimite;
	}


	public Expedicion() {
		super();
	}
	
	
	
}
