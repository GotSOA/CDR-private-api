package com.sungardas.esb.model;

import java.util.Date;

public class Contract {

	private String sgid;
	private String name;
	private long customerBillingAccountId;
	private long masterAgreementId;   // also known as globalAgreementId
	private String contractTypeDescription;
	private String contractRelationshipDescription;
	private String contractStatus;
	private Date startDate;
	private Date endDate;
	private String billingTypeDescription;
	private String billingCycleDescription;
	private String paymentMethodName;
	private long contractLevelDiscount;
	private String contractLanguageComponentName;
	private String currencyISOCode;		// 3 letter code
	private long monthlyCurrencyVolume;
	
	public String getSgid() {
		return sgid;
	}
	public void setSgid(String sgid) {
		this.sgid = sgid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCustomerBillingAccountId() {
		return customerBillingAccountId;
	}
	public void setCustomerBillingAccountId(long customerBillingAccountId) {
		this.customerBillingAccountId = customerBillingAccountId;
	}
	public long getMasterAgreementId() {
		return masterAgreementId;
	}
	public void setMasterAgreementId(long masterAgreementId) {
		this.masterAgreementId = masterAgreementId;
	}
	public String getContractTypeDescription() {
		return contractTypeDescription;
	}
	public void setContractTypeDescription(String contractTypeDescription) {
		this.contractTypeDescription = contractTypeDescription;
	}
	public String getContractRelationshipDescription() {
		return contractRelationshipDescription;
	}
	public void setContractRelationshipDescription(
			String contractRelationshipDescription) {
		this.contractRelationshipDescription = contractRelationshipDescription;
	}
	public String getContractStatus() {
		return contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
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
	public String getBillingTypeDescription() {
		return billingTypeDescription;
	}
	public void setBillingTypeDescription(String billingTypeDescription) {
		this.billingTypeDescription = billingTypeDescription;
	}
	public String getBillingCycleDescription() {
		return billingCycleDescription;
	}
	public void setBillingCycleDescription(String billingCycleDescription) {
		this.billingCycleDescription = billingCycleDescription;
	}
	public String getPaymentMethodName() {
		return paymentMethodName;
	}
	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}
	public long getContractLevelDiscount() {
		return contractLevelDiscount;
	}
	public void setContractLevelDiscount(long discount) {
		this.contractLevelDiscount = discount;
	}
	public String getContractLanguageComponentName() {
		return contractLanguageComponentName;
	}
	public void setContractLanguageComponentName(
			String contractLanguageComponentName) {
		this.contractLanguageComponentName = contractLanguageComponentName;
	}
	public String getCurrencyISOCode() {
		return currencyISOCode;
	}
	public void setCurrencyISOCode(String currencyISOCode) {
		this.currencyISOCode = currencyISOCode;
	}
	public long getMonthlyCurrencyVolume() {
		return monthlyCurrencyVolume;
	}
	public void setMonthlyCurrencyVolume(long monthlyCurrencyVolume) {
		this.monthlyCurrencyVolume = monthlyCurrencyVolume;
	}
}
