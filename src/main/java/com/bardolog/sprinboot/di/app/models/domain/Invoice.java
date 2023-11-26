package com.bardolog.sprinboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@SessionScope //contexto de sesión, cada sesión va a tener su propia instancia de factura y el componente debe implementar serializable
public class Invoice implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6689913478124300639L;


	@Value("${invoice.description}")
	private String description;
	
	@Autowired
	private Client client;
	
	@Autowired
	private List<ItemInvoice> items;
	
	
	@PostConstruct
	public void init() {
		client.setName("Maria José");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Factura destruida :".concat(description));
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<ItemInvoice> getItems() {
		return items;
	}

	public void setItems(List<ItemInvoice> items) {
		this.items = items;
	}

}
