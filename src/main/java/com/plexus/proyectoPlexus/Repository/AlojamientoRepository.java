package com.plexus.proyectoPlexus.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.plexus.proyectoPlexus.Entity.AlojamientoEntity;


@Repository
public interface AlojamientoRepository extends CrudRepository<AlojamientoEntity, Integer>{

}
