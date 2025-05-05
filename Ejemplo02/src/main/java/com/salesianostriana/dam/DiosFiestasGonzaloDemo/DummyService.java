package com.salesianostriana.dam.DiosFiestasGonzaloDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



/*
 * En los service la logica de negocio
 * Lo que hagamos aqui no se hace aqui, es para simular que hemos ido a la base de datos etc
 * Para inyectar lo normal es con los atributos
 */
@Service
public class DummyService {

	
	public Producto getProducto() {
		return new Producto("Camiseta","!Wena de verdad!",15.0f);
	}
	
	public List<Producto> lista(){
		List<Producto> aux=new ArrayList<Producto>();
		aux.add(new Producto("Coca-cola","Esto es una cocacola",2.0f));
		aux.add(new Producto("fanta","Esto es una fanta",2.0f));
		aux.add(new Producto("Pipsa","Esto es una Pipsa",2.0f));
		aux.add(new Producto("Salmon","Esto es un Salmon",2.0f));
		aux.add(new Producto("paraguas","Esto es un paraguas",2.0f));
		aux.add(new Producto("Sarten","Esto es una sartén",2.0f));
		
	return aux;
	
	}
	
}
