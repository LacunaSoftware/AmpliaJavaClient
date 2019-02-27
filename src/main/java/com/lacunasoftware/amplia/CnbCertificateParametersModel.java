package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class CnbCertificateParametersModel extends CertificateParametersModel {
	private String phoneNumber;


	@JsonProperty("phoneNumber")
	String getPhoneNumber() {
		return phoneNumber;
	}
	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
