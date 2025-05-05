package com.salesianostriana.dam.DiosFiestasGonzaloDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Contacto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private String apellidos;
	
	private String email;
	
	private String telefono;
	
	
}
