package com.sungardas.esb.model;

import java.util.Date;

public class Invoice {
	
	private String id;		// PK
	private long orderId;
	private long contractId;
	private String invoiceTypeDescription;
	// private String invoiceRelationshipDescription;		// ask Val: what's invoice relationship ?
	// lots of dates, please review
	private Date issueDate;   // 1st of month
	private Date dueDate;		// 15th
	private Date billThroughDate;		// 2 years from now (month after month)
	private long addressId;
	private long contactId;			// note: it was sgasContactId originally (now that both Sgas and Customer Contact use the same class)
	private long paymentMethodId;		
	private String remittanceInfo;		// doc to attach (check/routing/accoutNb, ACH, swift, creditcard...)
	private String currencyISOCode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getContractId() {
		return contractId;
	}
	public void setContractId(long contractId) {
		this.contractId = contractId;
	}
	public String getInvoiceTypeDescription() {
		return invoiceTypeDescription;
	}
	public void setInvoiceTypeDescription(String invoiceTypeDescription) {
		this.invoiceTypeDescription = invoiceTypeDescription;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getBillThroughDate() {
		return billThroughDate;
	}
	public void setBillThroughDate(Date billThroughDate) {
		this.billThroughDate = billThroughDate;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public long getPaymentMethodId() {
		return paymentMethodId;
	}
	public void setPaymentMethodId(long paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	public String getRemittanceInfo() {
		return remittanceInfo;
	}
	public void setRemittanceInfo(String remittanceInfo) {
		this.remittanceInfo = remittanceInfo;
	}
	public String getCurrencyISOCode() {
		return currencyISOCode;
	}
	public void setCurrencyISOCode(String currencyISOCode) {
		this.currencyISOCode = currencyISOCode;
	}
	
}
