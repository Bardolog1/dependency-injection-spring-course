package com.bardolog.sprinboot.di.app.models.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Invoice {
	
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
