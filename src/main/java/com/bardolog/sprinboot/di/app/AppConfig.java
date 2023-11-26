package com.bardolog.sprinboot.di.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bardolog.sprinboot.di.app.models.domain.ItemInvoice;
import com.bardolog.sprinboot.di.app.models.domain.Product;
import com.bardolog.sprinboot.di.app.models.services.IService;
import com.bardolog.sprinboot.di.app.models.services.ServiceOutSpringContainer;

@Configuration
public class AppConfig {

	@Bean("MyServiceNoSpringComp")		/*retornamos el componente que no esta anotado con @Component o con alguna de sus variantes*/
	public IService addServiceComponent() {
		return new ServiceOutSpringContainer();
	}
	
	
	@Bean("hola")
	public List<ItemInvoice> addItem(){
		Product prod1 = new Product("AMD Rayzen 9", 2500000.0);
		Product prod2 = new Product("Mouse Gamer", 100000.0);
		Product prod3 = new Product("RAM 8Gb DDR4", 180000.0);
		Product prod4 = new Product("Keyboard Gamer", 250000.0);
		
		ItemInvoice line1 = new ItemInvoice(prod1, 1);
		ItemInvoice line2 = new ItemInvoice(prod2, 2);
		ItemInvoice line3 = new ItemInvoice(prod3, 2);
		ItemInvoice line4 = new ItemInvoice(prod4, 1);
		
		return Arrays.asList(line1, line2, line3, line4);
		
		

	}
	
	
	
	
	
	
	
}
