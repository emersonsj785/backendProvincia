package com.reto02.microservicios.app.provincia.micorserviciosprovincia.controllers;

import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reto02.commons.entidad.models.entity.Provincia;
import com.reto02.microservicios.app.provincia.micorserviciosprovincia.services.ProvinciaService;
import com.reto02.microservicios.commons.controllers.CommonController;

@RestController
public class ProvinciaController extends CommonController<Provincia, ProvinciaService>
{
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Provincia provincia, @PathVariable Long id)
	{
		Optional<Provincia> p = service.findById(id);
		
		if(p.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Provincia provinciaDb = p.get();
		provinciaDb.setDescProvincia(provincia.getDescProvincia());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(provinciaDb));
		
	}
	
}
