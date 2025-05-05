package com.salesianostriana.dam.DiosFiestasGonzaloDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Controlador {

	/*
	 * Las clases que nos ayudan a inyectar cosas se les llama clases beans
	 * hay varios tipos:
	 * @controller
	 * @Repository
	 * @Service
	 * @Component--Las clases pojo
	 *
	 *Dentro de los beans van metodos de java uq se dedican a atender a las peticiones
	 *
	 *
	 *
	 *LENGUAJE DE MARCAS
	 *
	 * se pone th:el tipo de la variable"$(para indicar que es una variable){nombrevariable}"
	 *
	 *
	 */
	
	@GetMapping({"/","welcome"})
	public String welcome(@RequestParam(name="nombre",required=false, defaultValue= "Mundo") String nombre, Model model) {
		model.addAttribute("nombre",nombre);
		return "index";
	}
	
}
