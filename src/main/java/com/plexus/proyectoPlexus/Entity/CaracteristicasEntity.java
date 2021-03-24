package com.plexus.proyectoPlexus.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "caracteristicas")
public class CaracteristicasEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private boolean wifi;
	private boolean parking;
	private boolean piscina;
	private boolean mascotas;
	private boolean gimnasio;
	private boolean spa;

	public CaracteristicasEntity() {

	}

	public CaracteristicasEntity(int id, boolean wifi, boolean parking, boolean piscina, boolean mascotas,
			boolean gimnasio, boolean spa) {
		super();
		this.id = id;
		this.wifi = wifi;
		this.parking = parking;
		this.piscina = piscina;
		this.mascotas = mascotas;
		this.gimnasio = gimnasio;
		this.spa = spa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public boolean isMascotas() {
		return mascotas;
	}

	public void setMascotas(boolean mascotas) {
		this.mascotas = mascotas;
	}

	public boolean isGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(boolean gimnasio) {
		this.gimnasio = gimnasio;
	}

	public boolean isSpa() {
		return spa;
	}

	public void setSpa(boolean spa) {
		this.spa = spa;
	}

	@Override
	public String toString() {
		return "CaracteristicasEntity [id=" + id + ", wifi=" + wifi + ", parking=" + parking + ", piscina=" + piscina
				+ ", mascotas=" + mascotas + ", gimnasio=" + gimnasio + ", spa=" + spa + "]";
	}

}
