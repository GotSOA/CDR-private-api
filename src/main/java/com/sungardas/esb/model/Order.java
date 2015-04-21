package com.sungardas.esb.model;

import java.util.Date;
import java.util.List;

public class Order {
	private String id;			// PK
	private long contractId;
	private String orderTypeDescription;
	//private String companyName;		// isn't this redundant since we have the contractId already?
	//private String companyId;
	private String orderStatusDescription;
	private Date orderDate;
	private Date fulfillmentDate;
	private String orderDescription;
	private long orderLevelDiscount;	// naming convention?
	private String currencyISOCode;
	private String signature;
	
	public long getContractId() {
		return contractId;
	}
	public void setContractId(long contractId) {
		this.contractId = contractId;
	}
	public String getOrderTypeDescription() {
		return orderTypeDescription;
	}
	public void setOrderTypeDescription(String orderTypeDescription) {
		this.orderTypeDescription = orderTypeDescription;
	}

	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}
	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}

	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public long getOrderLevelDiscount() {
		return orderLevelDiscount;
	}
	public void setOrderLevelDiscount(long orderLevelDiscount) {
		this.orderLevelDiscount = orderLevelDiscount;
	}
	public String getCurrencyISOCode() {
		return currencyISOCode;
	}
	public void setCurrencyISOCode(String currencyISOCode) {
		this.currencyISOCode = currencyISOCode;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getFulfillmentDate() {
		return fulfillmentDate;
	}
	public void setFulfillmentDate(Date fulfillmentDate) {
		this.fulfillmentDate = fulfillmentDate;
	}

}
