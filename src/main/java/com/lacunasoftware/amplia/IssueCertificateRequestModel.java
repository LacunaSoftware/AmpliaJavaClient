package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class IssueCertificateRequestModel {
	private String orderId;
	private String csr;
	private String keyId;

	@JsonProperty("orderId")
	String getOrderId() {
		return orderId;
	}
	void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@JsonProperty("csr")
	String getCsr() {
		return csr;
	}
	void setCsr(String csr) {
		this.csr = csr;
	}

	@JsonProperty("keyId")
	String getKeyId() {
		return keyId;
	}
	void setKeyId(String keyId) {
		this.keyId = keyId;
	}
}
