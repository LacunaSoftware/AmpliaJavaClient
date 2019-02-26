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
	public NameModel getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(NameModel subjectName) {
		this.subjectName = subjectName;
	}

	@JsonProperty("emailAddress")
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@JsonProperty("issuerName")
	public NameModel getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(NameModel issuerName) {
		this.issuerName = issuerName;
	}

	@JsonProperty("serialNumber")
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@JsonProperty("validityStart")
	public String getValidityStart() {
		return validityStart;
	}
	public void setValidityStart(String validityStart) {
		this.validityStart = validityStart;
	}

	@JsonProperty("validityEnd")
	public String getValidityEnd() {
		return validityEnd;
	}
	public void setValidityEnd(String validityEnd) {
		this.validityEnd = validityEnd;
	}

	@JsonProperty("crlDistributionPoints")
	public List<String> getCrlDistributionPoints() {
		return crlDistributionPoints;
	}
	public void setCrlDistributionPoints(List<String> crlDistributionPoints) {
		this.crlDistributionPoints = crlDistributionPoints;
	}

	@JsonProperty("ocspUris")
	public List<String> getOcspUris() {
		return ocspUris;
	}
	public void setOcspUris(List<String> ocspUris) {
		this.ocspUris = ocspUris;
	}

	@JsonProperty("isSelfSigned")
	public Boolean isSelfSigned() {
		return isSelfSigned;
	}
	public void setSelfSigned(Boolean selfSigned) {
		isSelfSigned = selfSigned;
	}

	@JsonProperty("isCA")
	public Boolean isCA() {
		return isCA;
	}
	public void setIsCA(Boolean isCA) {
		this.isCA = isCA;
	}
}
