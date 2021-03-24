package com.plexus.proyectoPlexus.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class AlojamientoRepositoryStaticImpl implements AlojamientoRepositoryStatic {
	
	private String[] alojamientoEstatico = {"titulo", "descripcion", "comunidad", "tipo", "valoracion", "wifi", "desayuno", "imagen", "anadido"};

	@Override
	public String findOneStatic(Integer id) {
		return alojamientoEstatico[id];
	}

	@Override
	public String[] findAllStatic() {
		return alojamientoEstatico;
	}

}
