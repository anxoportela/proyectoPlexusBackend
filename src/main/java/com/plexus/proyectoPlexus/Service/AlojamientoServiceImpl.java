package com.plexus.proyectoPlexus.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plexus.proyectoPlexus.Entity.AlojamientoEntity;
import com.plexus.proyectoPlexus.Repository.AlojamientoRepository;
import com.plexus.proyectoPlexus.Repository.AlojamientoRepositoryStatic;

@Service
public class AlojamientoServiceImpl implements AlojamientoService{
	
	@Autowired
	private AlojamientoRepository alojamientoRepository;
	
	@Autowired
	private AlojamientoRepositoryStatic alojamientoRepositoryStatic;

	@Override
	public List<AlojamientoEntity> findAll() {
		return (List<AlojamientoEntity>) this.alojamientoRepository.findAll();
	}

	@Override
	public AlojamientoEntity findOne(Integer id) {
		return this.alojamientoRepository.findById(id).get();
	}

	@Override
	public AlojamientoEntity add(AlojamientoEntity newAlojamiento) {
		return this.alojamientoRepository.save(newAlojamiento);
	}

	@Override
	public void deleteByID(int id) {
		this.alojamientoRepository.deleteById(id);
		
	}

	@Override
	public String findOneStatic(Integer id) {
		return this.alojamientoRepositoryStatic.findOneStatic(id);
	}

	@Override
	public String[] findAllStatic() {
		return this.alojamientoRepositoryStatic.findAllStatic();
	}

	@Override
	public void delete(AlojamientoEntity newAlojamiento) {
		this.alojamientoRepository.delete(newAlojamiento);
		
	}

	@Override
	public boolean existsById(int id) {
		return this.alojamientoRepository.existsById(id);
	}

}
