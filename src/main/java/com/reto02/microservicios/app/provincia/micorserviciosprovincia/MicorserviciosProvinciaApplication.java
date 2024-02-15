package com.reto02.microservicios.app.provincia.micorserviciosprovincia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.reto02.commons.entidad.models.entity"})
public class MicorserviciosProvinciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicorserviciosProvinciaApplication.class, args);
	}

}
