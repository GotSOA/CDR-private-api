package com.sungardas.esb.model;

import java.util.List;

public class Usage {
	private String sgid;
	private long locationId;		// ask Val
	private long billingAccountId;
	private String usageTypeDescription;
	// private List<Long> usageDetailsId;		// don't need bi-directional reference, discuss with Val
	private String usagePeriod;		// ask Val: data type for period?
	private int usageCollectionFrequency;		// ask Val what unit of time?
	public String getSgid() {
		return sgid;
	}
	public void setSgid(String sgid) {
		this.sgid = sgid;
	}
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
	public String getUsagePeriod() {
		return usagePeriod;
	}
	public void setUsagePeriod(String usagePeriod) {
		this.usagePeriod = usagePeriod;
	}
	public int getUsageCollectionFrequency() {
		return usageCollectionFrequency;
	}
	public void setUsageCollectionFrequency(int usageCollectionFrequency) {
		this.usageCollectionFrequency = usageCollectionFrequency;
	}

}
