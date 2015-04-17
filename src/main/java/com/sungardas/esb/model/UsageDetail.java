package com.sungardas.esb.model;

public class UsageDetail {
	private String sgid;
	private long usageId;		
	private String name;
	private long value;		// ask Val: data type long, int, Money?...
	public String getSgid() {
		return sgid;
	}
	public void setSgid(String sgid) {
		this.sgid = sgid;
	}
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
}
