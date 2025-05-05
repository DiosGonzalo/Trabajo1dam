package com.salesianostriana.dam.DiosFiestasGonzaloDemo.servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.DiosFiestasGonzaloDemo.modelos.Expedicion;

import jakarta.annotation.PostConstruct;

@Service
public class ExpedicionServicio {

private List <Expedicion> lista=new ArrayList <Expedicion>();
	
@PostConstruct
 	public void init() {
    lista.add(new Expedicion("Everest", 5000.0, 10, LocalDate.now(), LocalDate.now().plusDays(30)));
    lista.add(new Expedicion("Kilimanjaro", 3000.0, 15, LocalDate.now(), LocalDate.now().plusDays(20)));
	}
	public void agregar (Expedicion e) {
		
		lista.add(e);
	}
		
	public List<Expedicion> getLista (){
		return lista; 
	}
}
