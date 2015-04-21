package com.sungardas.esb.model;

import java.util.Date;
import java.util.List;

public class Usage {
	
	private long id;		// PK
	private long locationId;		// similar to workplaceId (in Aria)
	private long billingAccountId;
	private String usageTypeDescription;
	private Date startDate;		
	private Date endDate;		
	private CollectionFrequencyEnum usageCollectionFrequency;		// ENUM
	
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public long getBillingAccountId() {
		return billingAccountId;
	}
	public void setBillingAccountId(long billingAccountId) {
		this.billingAccountId = billingAccountId;
	}
	public String getUsageTypeDescription() {
		return usageTypeDescription;
	}
	public void setUsageTypeDescription(String usageTypeDescription) {
		this.usageTypeDescription = usageTypeDescription;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public CollectionFrequencyEnum getUsageCollectionFrequency() {
		return usageCollectionFrequency;
	}
	public void setUsageCollectionFrequency(
			CollectionFrequencyEnum usageCollectionFrequency) {
		this.usageCollectionFrequency = usageCollectionFrequency;
	}

}
