package com.reto02.microservicios.app.provincia.micorserviciosprovincia.services;
import org.springframework.stereotype.Service;

import com.reto02.commons.entidad.models.entity.Provincia;
import com.reto02.microservicios.app.provincia.micorserviciosprovincia.models.repository.ProvinciaRepository;
import com.reto02.microservicios.commons.services.CommonServiceImpl;

@Service
public class ProvinciaServiceImpl extends CommonServiceImpl<Provincia, ProvinciaRepository> implements ProvinciaService 
{
	
}
