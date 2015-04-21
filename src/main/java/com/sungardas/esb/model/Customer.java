package com.sungardas.esb.model;

import java.util.List;

public class Customer {
	private String id;		// PK, sgid
	private String parentId;
	private String companyName;
	private String companyDomain;
	private Address address;
	private List<Contact> contact;
	private List<BillingAccount> billingAccount;
	private List<Order> order;
	private String customerType;


	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDomain() {
		return companyDomain;
	}

	public void setCompanyDomain(String companyDomain) {
		this.companyDomain = companyDomain;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<BillingAccount> getBillingAccount() {
		return billingAccount;
	}

	public void setBillingAccount(List<BillingAccount> billingAccount) {
		this.billingAccount = billingAccount;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	
}
