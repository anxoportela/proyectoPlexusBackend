package com.plexus.proyectoPlexus.Controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plexus.proyectoPlexus.Entity.AlojamientoEntity;
import com.plexus.proyectoPlexus.Service.AlojamientoService;

@RestController
@RequestMapping("/alojamientos")
public class AlojamientosController {
	
	@Autowired
	private AlojamientoService alojamientoService;
	
	 Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public ResponseEntity<List<AlojamientoEntity>> alojamientoGetAll() { 
		
		logger.info("Get All Alojamientos");
		
		return ResponseEntity.ok(this.alojamientoService.findAll());

	} 
	@GetMapping(path = "{id}")
	public ResponseEntity<AlojamientoEntity> alojamientoGetOne(@PathVariable(name= "id") int id) {
		
		logger.info("Get Alojamiento for id :"+id);
		
		return ResponseEntity.ok(this.alojamientoService.findOne(id));

	} 
	@GetMapping(path = "/static/{id}")
	public ResponseEntity<String> alojamientoStaticGetOne(@PathVariable(name= "id") int id) {
		
		logger.info("Get Alojamiento for id :"+id);
		
		return ResponseEntity.ok(this.alojamientoService.findOneStatic(id));

	} 
	@GetMapping(path = "/static")
	public ResponseEntity<String[]> alojamientoGetOne() {
		
		logger.info("Get Alojamiento for static");
		
		return ResponseEntity.ok(this.alojamientoService.findAllStatic());

	} 
	
	@PostMapping()
	public  ResponseEntity<AlojamientoEntity> add( @RequestBody AlojamientoEntity alojamiento) {
		 	
		AlojamientoEntity newComponent=null;
		
		logger.info("Create: " +alojamiento); 
		try {
			newComponent=this.alojamientoService.add(alojamiento);
		} catch (Exception e) {
			logger.error("MSG: "+e.getMessage());
			logger.error("CAUSE: "+e.getCause());
		}
		return ResponseEntity.ok(newComponent);
	}
	@DeleteMapping(value = "/{id}")
    public ResponseEntity<Integer> deletePost(@PathVariable int id) {
  
		logger.info("Delete: " + id); 
		try {
			 this.alojamientoService.deleteByID(id);
		} catch (Exception e) {
			logger.error("MSG: "+e.getMessage());
			logger.error("CAUSE: "+e.getCause());
		}

		if(this.alojamientoService.existsById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(id, HttpStatus.OK);
    }
	@DeleteMapping
    public ResponseEntity<Integer> deletePostEntity( @RequestBody AlojamientoEntity alojamiento) {
  
		logger.info("Delete: " + alojamiento); 
		try {
			 this.alojamientoService.delete(alojamiento);
		} catch (Exception e) {
			logger.error("MSG: "+e.getMessage());
			logger.error("CAUSE: "+e.getCause());
		}

		if(this.alojamientoService.existsById(alojamiento.getId())) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(alojamiento.getId(), HttpStatus.OK);
    }

}
