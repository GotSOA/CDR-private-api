package com.sungardas.esb.model;

import java.util.Date;
import java.util.List;

public class Order {
	private String sgid;
	private long contractId;
	private String orderTypeDescription;
	private String companyName;		// isn't this redundant since we have the contractId already?
	//private String companyId;
	private String orderStatusDescription;
	private Date startDate;
	private Date endDate;
	private String orderDescription;
	private long orderLevelDiscount;
	private String currencyISOCode;
	private List<String> signatures;
	
	public String getSgid() {
		return sgid;
	}
	public void setSgid(String sgid) {
		this.sgid = sgid;
	}
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}
	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	public List<String> getSignatures() {
		return signatures;
	}
	public void setSignatures(List<String> signatures) {
		this.signatures = signatures;
	}

}
