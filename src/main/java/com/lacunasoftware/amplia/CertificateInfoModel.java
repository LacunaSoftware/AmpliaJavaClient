package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
class CertificateInfoModel {

	private NameModel subjectName = null;
	private String emailAddress = null;
	private NameModel issuerName = null;
	private String serialNumber = null;
	private String validityStart = null;
	private String validityEnd = null;
	private List<String> crlDistributionPoints = null;
	private List<String> ocspUris = null;
	private Boolean isSelfSigned = null;
	private Boolean isCA = null;


	@JsonProperty("subjectName")
	NameModel getSubjectName() {
		return subjectName;
	}
	void setSubjectName(NameModel subjectName) {
		this.subjectName = subjectName;
	}

	@JsonProperty("emailAddress")
	String getEmailAddress() {
		return emailAddress;
	}
	void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@JsonProperty("issuerName")
	NameModel getIssuerName() {
		return issuerName;
	}
	void setIssuerName(NameModel issuerName) {
		this.issuerName = issuerName;
	}

	@JsonProperty("serialNumber")
	String getSerialNumber() {
		return serialNumber;
	}
	void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@JsonProperty("validityStart")
	String getValidityStart() {
		return validityStart;
	}
	void setValidityStart(String validityStart) {
		this.validityStart = validityStart;
	}

	@JsonProperty("validityEnd")
	String getValidityEnd() {
		return validityEnd;
	}
	void setValidityEnd(String validityEnd) {
		this.validityEnd = validityEnd;
	}

	@JsonProperty("crlDistributionPoints")
	List<String> getCrlDistributionPoints() {
		return crlDistributionPoints;
	}
	void setCrlDistributionPoints(List<String> crlDistributionPoints) {
		this.crlDistributionPoints = crlDistributionPoints;
	}

	@JsonProperty("ocspUris")
	List<String> getOcspUris() {
		return ocspUris;
	}
	void setOcspUris(List<String> ocspUris) {
		this.ocspUris = ocspUris;
	}

	@JsonProperty("isSelfSigned")
	Boolean isSelfSigned() {
		return isSelfSigned;
	}
	void setSelfSigned(Boolean selfSigned) {
		isSelfSigned = selfSigned;
	}

	@JsonProperty("isCA")
	Boolean isCA() {
		return isCA;
	}
	void setIsCA(Boolean isCA) {
		this.isCA = isCA;
	}
}
