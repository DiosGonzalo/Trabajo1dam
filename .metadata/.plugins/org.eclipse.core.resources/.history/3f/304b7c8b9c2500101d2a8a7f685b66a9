package com.salesianostriana.dam.DiosFiestasGonzaloDemo.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.DiosFiestasGonzaloDemo.modelos.Expedicion;
import com.salesianostriana.dam.DiosFiestasGonzaloDemo.servicios.ExpedicionServicio;

@Controller
public class ExpedicionController {

    private  ExpedicionServicio servicio;

    public ExpedicionController(ExpedicionServicio expedicionServicio) {
        this.servicio = expedicionServicio;
    }

    @GetMapping("/")
    public String index(Model model) {
        
        return "Index"; 
    }
    
    @GetMapping("/nueva")
    public String mostrarFormulario(Model model) {
        model.addAttribute("expedicion", new Expedicion());
        return "agregarExpedicion"; 
    }
    
    @PostMapping("/nueva/summit")
    public String procesarFormulario(@ModelAttribute("expedicion") Expedicion expedicion) {
        servicio.agregar(expedicion);
        return "redirect:/"; 
    }   
    
   @GetMapping("/expediciones")
   public String muestraExpediciones(Model model) {
	   System.out.println("asd");
	   model.addAttribute("expediciones",servicio.getLista());
	   System.out.println(servicio.getLista());
	   return "expediciones";
   }
   
}