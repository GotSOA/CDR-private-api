package com.sungardas.esb.model;

import java.util.HashMap;
import java.util.Map;

public class Rosetta {
	
	private long id;		// PK  (meaningless)
	private String key;
	private String value;
	private ObjectTypeEnum objectType;
	private long sgid;
	
	public Map<String, String> translateFromSungardId(String sgid) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put(key, value);
		return map;
	}
	
	public String translateFromSungardId(String sgid, String value) {
		return key;
	}
	
	public String translateToSungardId(String key, String value) {
		return key;
	}
	
	// getter - setters
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public long getSgid() {
		return sgid;
	}
	public void setSgid(long sgid) {
		this.sgid = sgid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ObjectTypeEnum getObjectType() {
		return objectType;
	}

	public void setObjectType(ObjectTypeEnum objectType) {
		this.objectType = objectType;
	}
	
}
