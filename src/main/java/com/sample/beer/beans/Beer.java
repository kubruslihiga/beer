package com.sample.beer.beans;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Beer implements Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String sapId;
	private String salesForceId;

	public Beer() {
	}

	public Beer(String id, String name, String sapId, String salesForceId) {
		super();
		this.id = id;
		this.name = name;
		this.sapId = sapId;
		this.salesForceId = salesForceId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSapId() {
		return sapId;
	}

	public void setSapId(String sapId) {
		this.sapId = sapId;
	}

	public String getSalesForceId() {
		return salesForceId;
	}
	
	public void setSalesForceId(String salesForceId) {
		this.salesForceId = salesForceId;
	}
}
