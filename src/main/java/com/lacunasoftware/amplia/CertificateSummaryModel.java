package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class CertificateSummaryModel {
	public enum CertificateKinds {
		PublicKey, Attribute
	}
	public enum CertificateFormats {
		PkiBrazil, Ssl, Cnb, CnbCA, Cie, Arisp
	}

	private String id = null;
	private String subscriptionId = null;
	private String caId = null;
	private String keyId = null;
	private String dateIssued = null;
	private String dateExpires = null;
	private String dateRevoked = null;
	private String alias = null;
	private String subjectDisplayName = null;
	private String serialNumber = null;
	private Boolean isCA = null;
	private CertificateKinds kind = null;
	private CertificateFormats format = null;


	@JsonProperty("id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("subscriptionId")
	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	@JsonProperty("caId")
	public String getCAId() {
		return caId;
	}
	public void setCAId(String caId) {
		this.caId = caId;
	}

	@JsonProperty("keyId")
	public String getKeyId() {
		return keyId;
	}
	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	@JsonProperty("dateIssued")
	public String getDateIssued() {
		return dateIssued;
	}
	public void setDateIssued(String dateIssued) {
		this.dateIssued = dateIssued;
	}

	@JsonProperty("dateExpires")
	public String getDateExpires() {
		return dateExpires;
	}
	public void setDateExpires(String dateExpires) {
		this.dateExpires = dateExpires;
	}

	@JsonProperty("dateRevoked")
	public String getDateRevoked() {
		return dateRevoked;
	}
	public void setDateRevoked(String dateRevoked) {
		this.dateRevoked = dateRevoked;
	}

	@JsonProperty("alias")
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	@JsonProperty("subjectDisplayName")
	public String getSubjectDisplayName() {
		return subjectDisplayName;
	}
	public void setSubjectDisplayName(String subjectDisplayName) {
		this.subjectDisplayName = subjectDisplayName;
	}

	@JsonProperty("serialNumber")
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@JsonProperty("isCa")
	public Boolean isCA() {
		return isCA;
	}
	public void setIsCA(Boolean isCA) {
		this.isCA = isCA;
	}

	@JsonProperty("kind")
	public CertificateKinds getKind() {
		return kind;
	}
	public void setKind(CertificateKinds kind) {
		this.kind = kind;
	}

	@JsonProperty("format")
	public CertificateFormats getFormat() {
		return format;
	}
	public void setFormat(CertificateFormats format) {
		this.format = format;
	}
}
