package com.plexus.proyectoPlexus.Service;

import java.util.List;

import com.plexus.proyectoPlexus.Entity.AlojamientoEntity;

public interface AlojamientoService {
	
	public List<AlojamientoEntity> findAll(); 
	public AlojamientoEntity findOne(Integer id);
	public AlojamientoEntity add(AlojamientoEntity newAlojamiento);
	public void deleteByID(int id);
	
	public String findOneStatic(Integer id);
	public String[] findAllStatic();
	
	public void delete(AlojamientoEntity newAlojamiento);
	
	public boolean existsById(int id);

}
