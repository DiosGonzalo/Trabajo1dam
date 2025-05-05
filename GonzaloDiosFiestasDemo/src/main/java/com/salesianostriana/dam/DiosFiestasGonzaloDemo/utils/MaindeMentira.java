package com.salesianostriana.dam.DiosFiestasGonzaloDemo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.salesianostriana.dam.DiosFiestasGonzaloDemo.GonzaloDiosFiestasDemoApplication;
import com.salesianostriana.dam.DiosFiestasGonzaloDemo.reps.ContactoRepositorio;

import jakarta.annotation.PostConstruct;

@Component
public class MaindeMentira {

   

	@Autowired
	private ContactoRepositorio contactoRepositorio;


   
	
	@PostConstruct
	public void ejecutar() {
		
		contactoRepositorio.findAll()
		.forEach(b->b.toString())
	}
}
