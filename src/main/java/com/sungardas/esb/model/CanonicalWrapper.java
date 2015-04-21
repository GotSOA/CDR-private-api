package com.sungardas.esb.model;

import java.util.List;

/**
 * @author sri.vellala
 *
 */

// theoritical only, will we be needing a wrapper?

public class CanonicalWrapper  {
	private Customer customer;
	private Product product;
	private List<Order> orders;
	private List<BillingAccount> billingAccounts;
	private List<Contact> contacts;		// contacts are now generic: Sgas and Customer		
	private List<Usage> usages;
	private List<UsageDetail> usageDetails;
	private List<RateSheet> rateSheets;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public List<BillingAccount> getBillingAccounts() {
		return billingAccounts;
	}
	public void setBillingAccounts(List<BillingAccount> billingAccounts) {
		this.billingAccounts = billingAccounts;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public List<Usage> getUsages() {
		return usages;
	}
	public void setUsages(List<Usage> usages) {
		this.usages = usages;
	}
	public List<UsageDetail> getUsageDetails() {
		return usageDetails;
	}
	public void setUsageDetails(List<UsageDetail> usageDetails) {
		this.usageDetails = usageDetails;
	}
	public List<RateSheet> getRateSheets() {
		return rateSheets;
	}
	public void setRateSheets(List<RateSheet> rateSheets) {
		this.rateSheets = rateSheets;
	}
}
