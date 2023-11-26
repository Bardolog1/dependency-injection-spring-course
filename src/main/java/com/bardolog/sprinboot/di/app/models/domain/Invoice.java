package com.bardolog.sprinboot.di.app.models.domain;

import java.util.List;

public class Invoice {
	
	private String description;
	private Client client;
	private List<ItemInvoice> items;
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
