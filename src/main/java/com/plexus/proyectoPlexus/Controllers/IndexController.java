package com.plexus.proyectoPlexus.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class IndexController {
	private String[] alojamientoEstatico = {"titulo", "descripcion", "comunidad", "tipo", "valoracion", "wifi", "desayuno", "imagen", "anadido"};
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String[]>  getIndexPage() {
		
		return ResponseEntity.ok(alojamientoEstatico);
	}
	
	
	
}
