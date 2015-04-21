package com.sungardas.esb.model;

public class RateSheet {

	private String id;		// PK
	private long price;
	private String unitOfMeasure;
	private String currencyISOCode;		// CAD, CHF, USD, JPY
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public String getCurrencyISOCode() {
		return currencyISOCode;
	}
	public void setCurrencyISOCode(String currencyISOCode) {
		this.currencyISOCode = currencyISOCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
