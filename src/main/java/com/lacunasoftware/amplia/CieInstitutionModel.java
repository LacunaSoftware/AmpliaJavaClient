package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CieInstitutionModel {
	private String name = null;
	private String city = null;
	private String state = null;

	public CieInstitutionModel() {
	}

	@JsonProperty("name")
	String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("city")
	String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("state")
	String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
