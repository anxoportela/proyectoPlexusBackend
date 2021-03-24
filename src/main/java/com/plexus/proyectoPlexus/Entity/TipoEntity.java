package com.plexus.proyectoPlexus.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo")
public class TipoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String tipo;

	public TipoEntity() {
		
	}

	public TipoEntity(int id, String name) {
		super();
		this.id = id;
		this.tipo = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return tipo;
	}

	public void setName(String name) {
		this.tipo = name;
	}

	@Override
	public String toString() {
		return "TipoEntity [id=" + id + ", name=" + tipo + "]";
	}
	
	

}
