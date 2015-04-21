package com.sungardas.esb.model;

public class OrderLineItem {
	
	private long id;		// PK
	private long orderId;
	private long productId;
	private int productQuantity;
	private String productComponent;		// component vs. product?   shouldn't that be a pointer to productComponent
	private String productLocation;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductComponent() {
		return productComponent;
	}
	public void setProductComponent(String productComponent) {
		this.productComponent = productComponent;
	}
	public String getProductLocation() {
		return productLocation;
	}
	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}
	
}
