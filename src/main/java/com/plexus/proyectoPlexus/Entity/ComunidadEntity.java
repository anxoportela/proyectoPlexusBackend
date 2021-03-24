package com.plexus.proyectoPlexus.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comunidad")
public class ComunidadEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String comunidad;

	public ComunidadEntity() {
		
	}

	public ComunidadEntity(int id, String name) {
		super();
		this.id = id;
		this.comunidad = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return comunidad;
	}

	public void setName(String name) {
		this.comunidad = name;
	}

	@Override
	public String toString() {
		return "TipoEntity [id=" + id + ", name=" + comunidad + "]";
	}
	
	

}
