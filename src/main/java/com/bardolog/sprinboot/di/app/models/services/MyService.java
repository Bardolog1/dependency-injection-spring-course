package com.bardolog.sprinboot.di.app.models.services;

import org.springframework.stereotype.Service;

@Service("MyService")
public class MyService implements IService {

	@Override
	public String operation() {
		return "Ejecutando servicio";
	}
	
}
