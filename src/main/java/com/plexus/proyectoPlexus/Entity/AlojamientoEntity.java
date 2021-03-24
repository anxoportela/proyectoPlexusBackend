package com.plexus.proyectoPlexus.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "alojamientos")
public class AlojamientoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titulo;
	private String descripcion;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "comunidad")
	private ComunidadEntity comunidad;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "tipo")
	private TipoEntity tipo;
	
	private int valoracion;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "caracteristicas")
	private CaracteristicasEntity caracteristicas;
	
	private boolean desayuno;
	private String imagen;
	private String anadido;
	
	
	public AlojamientoEntity() {
		
	}


	public AlojamientoEntity(int id, String titulo, String descripcion, ComunidadEntity comunidad, TipoEntity tipo,
			int valoracion, CaracteristicasEntity caracteristicas, boolean desayuno, String imagen, String anadido) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.comunidad = comunidad;
		this.tipo = tipo;
		this.valoracion = valoracion;
		this.caracteristicas = caracteristicas;
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


	public ComunidadEntity getComunidad() {
		return comunidad;
	}


	public void setComunidad(ComunidadEntity comunidad) {
		this.comunidad = comunidad;
	}


	public TipoEntity getTipo() {
		return tipo;
	}


	public void setTipo(TipoEntity tipo) {
		this.tipo = tipo;
	}


	public int getValoracion() {
		return valoracion;
	}


	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}


	public CaracteristicasEntity getCarcateristicas() {
		return caracteristicas;
	}


	public void setCarcateristicas(CaracteristicasEntity carcateristicas) {
		this.caracteristicas = carcateristicas;
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
				+ comunidad + ", tipo=" + tipo + ", valoracion=" + valoracion + ", carcateristicas=" + caracteristicas
				+ ", desayuno=" + desayuno + ", imagen=" + imagen + ", anadido=" + anadido + "]";
	}

	
}
