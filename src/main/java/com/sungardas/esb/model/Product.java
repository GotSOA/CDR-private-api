package com.sungardas.esb.model;

import java.util.Date;

public class Product {
	
	private String sgid;
	private String name;
	private String description;
	private String categoryDescription;
	private String typeDescription;
	private String relationshipDescription;
	private String statusDescription;
	private Date startDate;
	private Date endDate;
	private String componentDescription;
	private String locationDescription;
	private RateSheet rateSheet;
	private String deliveryMethodDescription;
	private String countryISOCode;		// 2 letter code
	private String generalLedgerCode;
	private long ariaPlanId;
	private long ariaServiceId;
	private String skuDescription;
	private boolean discountinued;
	private String taxCategoryCode;
	private String soldFrom;
	private long lobId;			// ?
	private String sfdcProductCodeId;    // guid or long? see in SFDC product sObject
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getTypeDescription() {
		return typeDescription;
	}
	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}
	public String getRelationshipDescription() {
		return relationshipDescription;
	}
	public void setRelationshipDescription(String relationshipDescription) {
		this.relationshipDescription = relationshipDescription;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
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
	public String getComponentDescription() {
		return componentDescription;
	}
	public void setComponentDescription(String componentDescription) {
		this.componentDescription = componentDescription;
	}
	public String getLocationDescription() {
		return locationDescription;
	}
	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}
	public RateSheet getRateSheet() {
		return rateSheet;
	}
	public void setRateSheet(RateSheet rateSheet) {
		this.rateSheet = rateSheet;
	}
	public String getDeliveryMethodDescription() {
		return deliveryMethodDescription;
	}
	public void setDeliveryMethodDescription(String deliveryMethodDescription) {
		this.deliveryMethodDescription = deliveryMethodDescription;
	}
	public String getCountryISOCode() {
		return countryISOCode;
	}
	public void setCountryISOCode(String countryISOCode) {
		this.countryISOCode = countryISOCode;
	}
	public String getGeneralLedgerCode() {
		return generalLedgerCode;
	}
	public void setGeneralLedgerCode(String generalLedgerCode) {
		this.generalLedgerCode = generalLedgerCode;
	}
	public long getAriaPlanId() {
		return ariaPlanId;
	}
	public void setAriaPlanId(long ariaPlanId) {
		this.ariaPlanId = ariaPlanId;
	}
	public long getAriaServiceId() {
		return ariaServiceId;
	}
	public void setAriaServiceId(long ariaServiceId) {
		this.ariaServiceId = ariaServiceId;
	}
	public String getSkuDescription() {
		return skuDescription;
	}
	public void setSkuDescription(String skuDescription) {
		this.skuDescription = skuDescription;
	}
	public boolean isDiscountinued() {
		return discountinued;
	}
	public void setDiscountinued(boolean discountinued) {
		this.discountinued = discountinued;
	}
	public String getTaxCategoryCode() {
		return taxCategoryCode;
	}
	public void setTaxCategoryCode(String taxCategoryCode) {
		this.taxCategoryCode = taxCategoryCode;
	}
	public String getSoldFrom() {
		return soldFrom;
	}
	public void setSoldFrom(String soldFrom) {
		this.soldFrom = soldFrom;
	}
	public long getLobId() {
		return lobId;
	}
	public void setLobId(long lobId) {
		this.lobId = lobId;
	}
	public String getSfdcProductCodeId() {
		return sfdcProductCodeId;
	}
	public void setSfdcProductCodeId(String sfdcProductCodeId) {
		this.sfdcProductCodeId = sfdcProductCodeId;
	}

	
}
