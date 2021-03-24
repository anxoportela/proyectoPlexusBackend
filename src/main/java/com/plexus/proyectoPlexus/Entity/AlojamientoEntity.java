package com.plexus.proyectoPlexus.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "alojamientos")
public class AlojamientoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titulo;
	private String descripcion;
	private String comunidad;
	private String tipo;
	private int valoracion;
	private boolean wifi;
	private boolean desayuno;
	private String imagen;
	private String anadido;
	
	
	public AlojamientoEntity() {
		
	}
	
	
	public AlojamientoEntity(int id, String titulo, String descripcion, String comunidad, String tipo, int valoracion,
			boolean wifi, boolean desayuno, String imagen, String anadido) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.comunidad = comunidad;
		this.tipo = tipo;
		this.valoracion = valoracion;
		this.wifi = wifi;
		this.desayuno = desayuno;
		this.imagen = imagen;
		this.anadido = anadido;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getComunidad() {
		return comunidad;
	}
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getValoracion() {
		return valoracion;
	}
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isDesayuno() {
		return desayuno;
	}
	public void setDesayuno(boolean desayuno) {
		this.desayuno = desayuno;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getAnadido() {
		return anadido;
	}
	public void setAnadido(String anadido) {
		this.anadido = anadido;
	}


	@Override
	public String toString() {
		return "AlojamientoEntity [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", comunidad="
				+ comunidad + ", tipo=" + tipo + ", valoracion=" + valoracion + ", wifi=" + wifi + ", desayuno="
				+ desayuno + ", imagen=" + imagen + ", anadido=" + anadido + "]";
	}
	


}
