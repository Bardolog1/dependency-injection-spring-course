package com.bardolog.sprinboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("otherService")
@Primary  // se inyectará esta clase con prioridad por encima de cualquer otra clase que implemente la misma interface
public class OtherService  implements IService{

	@Override
	public String operation() {
		
		return "I´m other service and  implements IService like MyService, but we implement it differently";
	}

	
	
}
