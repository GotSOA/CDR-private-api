package com.sungardas.esb.model;

import java.util.List;

public class BillingAccount {
	
	private String id;			// PK
	// was missing in the model
	private long customerId;
	private String currency;
	private Contact billingContact;			// Customer contact type
	private Address billingAddress;
	private List<Usage> usage;
	
	/*
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	*/
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Contact getBillingContact() {
		return billingContact;
	}
	public void setBillingContact(Contact billingContact) {
		this.billingContact = billingContact;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public List<Usage> getUsage() {
		return usage;
	}
	public void setUsage(List<Usage> usage) {
		this.usage = usage;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	
	
}
