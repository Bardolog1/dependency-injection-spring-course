package com.bardolog.sprinboot.di.app.models.services;



public class ServiceOutSpringContainer implements IService{

	@Override
	public String operation() {
		return "Este es un componente (Service) que no tiene la anotación @Component, asi que el contenedor de spring no lo encontrará para inyectarlo, pero podemos agregarlo mediante @Configuration en una clase en la raiz del proyecto";
	}

}
