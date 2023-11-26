package com.bardolog.sprinboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bardolog.sprinboot.di.app.models.services.IService;

@Controller
public class IndexController {
	
	@Autowired
	private IService service;
	
	@Autowired
	@Qualifier("MyService")
	private IService service2;
	
	@Autowired
	@Qualifier("MyServiceNoSpringComp")
	private IService service3;
	
	
	
	
	@GetMapping({"","/","/index"})
	public String index(Model model) {
		
		model.addAttribute("dato", service.operation()); 
		model.addAttribute("dato2", service2.operation()); 
		model.addAttribute("dato3", service3.operation()); 

		return "index";
	}
	
	 

	//@Autowired  /*aqui tambien podemos hacer la inyeccion de la interface del servicio usando el Autowired*/
	public void setService(IService service) {
		this.service = service;
	}
	
	
	
	

}
