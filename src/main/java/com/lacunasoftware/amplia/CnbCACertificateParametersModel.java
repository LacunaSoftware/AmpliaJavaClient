package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties
class CnbCACertificateParametersModel extends CertificateParametersModel {
	private String name;
	private String cns;
	private String streetAddress;
	private String locality;
	private String stateName;
	private String postalCode;

	@JsonProperty("name")
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}

	@JsonProperty("cns")
	String getCns() {
		return cns;
	}
	void setCns(String cns) {
		this.cns = cns;
	}

	@JsonProperty("streetAddress")
	String getStreetAddress() {
		return streetAddress;
	}
	void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	@JsonProperty("locality")
	String getLocality() {
		return locality;
	}
	void setLocality(String locality) {
		this.locality = locality;
	}

	@JsonProperty("stateName")
	String getStateName() {
		return stateName;
	}
	void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@JsonProperty("postalCode")
	String getPostalCode() {
		return postalCode;
	}
	void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
