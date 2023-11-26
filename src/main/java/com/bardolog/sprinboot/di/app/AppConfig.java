package com.bardolog.sprinboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bardolog.sprinboot.di.app.models.services.IService;
import com.bardolog.sprinboot.di.app.models.services.ServiceOutSpringContainer;

@Configuration
public class AppConfig {

	@Bean("MyServiceNoSpringComp")
	public IService addServiceComponent() {
		//retornamos el componente que no esta anotado con @Component o con alguna de sus variantes
		return new ServiceOutSpringContainer();
	}
	
}
