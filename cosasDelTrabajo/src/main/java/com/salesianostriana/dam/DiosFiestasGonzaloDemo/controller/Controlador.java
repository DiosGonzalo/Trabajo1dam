package com.salesianostriana.dam.DiosFiestasGonzaloDemo.controller;

import org.springframework.ui.Model;

@Controller
public class Controlador {

    @Autowired
    private Servicio personaService;

    // Mostrar el formulario
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("persona", new Persona());
        return "formulario";
    }

    // Procesar el formulario
    @PostMapping("/formulario")
    public String procesarFormulario(@ModelAttribute Persona persona) {
        personaService.agregarPersona(persona);
        return "redirect:/lista";
    }

    // Mostrar la lista de personas
    @GetMapping("/lista")
    public String mostrarLista(Model model) {
        model.addAttribute("personas", personaService.obtenerPersonas());
        return "lista";
    }
}

