package com.sungardas.esb.model;

public class UsageDetail {
	
	private String id;		// PK
	private long usageId;		
	private String name;
	private long value;		// ask Val: data type long, int, Money?...
	// see new model

	public long getUsageId() {
		return usageId;
	}
	public void setUsageId(long usageId) {
		this.usageId = usageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getValue() {
		return value;
	}
	public void setValue(long value) {
		this.value = value;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
