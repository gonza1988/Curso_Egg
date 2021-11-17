/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.egg.aplicacion.controladores;

import ar.edu.egg.aplicacion.entidades.Autor;
import ar.edu.egg.aplicacion.servicios.AutorServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorServicio autorServicio;

    @GetMapping("/cargarautor")
    public String formulario() {
        return "cargar-autor";
    }

    @PostMapping("/cargarautor")
    public String lista(ModelMap modelo, @RequestParam String nombre) {

        List<Autor> autores = autorServicio.buscarPorNombre(nombre);

        modelo.addAttribute("autores", autores);

        modelo.put("exito", "Registro exitoso");
        return "cargar-autor";
    }
    
    @GetMapping("/baja/{id}")
	public String baja(ModelMap modelo, @PathVariable String id) {

		try {
			autorServicio.baja(id);
			return "redirect:/autor/cargarautor";
		} catch (Exception e) {
			return "redirect:/";
		}
	}
	@GetMapping("/alta/{id}")
	public String alta(ModelMap modelo, @PathVariable String id) {

		try {
			autorServicio.alta(id);
			return "redirect:/autor/cargarautor";
		} catch (Exception e) {
			return "redirect:/";
		}
	}
}
