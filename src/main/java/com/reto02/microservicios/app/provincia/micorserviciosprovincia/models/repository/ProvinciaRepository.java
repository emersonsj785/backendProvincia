package com.reto02.microservicios.app.provincia.micorserviciosprovincia.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.reto02.commons.entidad.models.entity.Provincia;


public interface ProvinciaRepository extends CrudRepository<Provincia, Long>
{
	
}
