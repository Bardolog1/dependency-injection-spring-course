package com.bardolog.sprinboot.di.app.models.domain;

public class ItemInvoice {
	
	private Product product;
	private Integer count;
	
	public ItemInvoice(Product product, Integer count) {
		this.product = product;
		this.count = count;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public  Double calculateImport() {
		return this.product.getPrice() * this.count;
	}
	
	

}
