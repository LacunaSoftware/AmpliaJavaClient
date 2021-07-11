package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class CertificateSummaryModel {
	public enum CertificateKinds {
		PublicKey, Attribute
	}
	public enum CertificateFormats {
		PkiBrazil, Ssl, Cnb, CnbCA, Cie, Arisp, Latinus
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
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}

	@JsonProperty("subscriptionId")
	String getSubscriptionId() {
		return subscriptionId;
	}
	void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	@JsonProperty("caId")
	String getCAId() {
		return caId;
	}
	void setCAId(String caId) {
		this.caId = caId;
	}

	@JsonProperty("keyId")
	String getKeyId() {
		return keyId;
	}
	void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	@JsonProperty("dateIssued")
	String getDateIssued() {
		return dateIssued;
	}
	void setDateIssued(String dateIssued) {
		this.dateIssued = dateIssued;
	}

	@JsonProperty("dateExpires")
	String getDateExpires() {
		return dateExpires;
	}
	void setDateExpires(String dateExpires) {
		this.dateExpires = dateExpires;
	}

	@JsonProperty("dateRevoked")
	String getDateRevoked() {
		return dateRevoked;
	}
	void setDateRevoked(String dateRevoked) {
		this.dateRevoked = dateRevoked;
	}

	@JsonProperty("alias")
	String getAlias() {
		return alias;
	}
	void setAlias(String alias) {
		this.alias = alias;
	}

	@JsonProperty("subjectDisplayName")
	String getSubjectDisplayName() {
		return subjectDisplayName;
	}
	void setSubjectDisplayName(String subjectDisplayName) {
		this.subjectDisplayName = subjectDisplayName;
	}

	@JsonProperty("serialNumber")
	String getSerialNumber() {
		return serialNumber;
	}
	void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@JsonProperty("isCa")
	Boolean isCA() {
		return isCA;
	}
	void setIsCA(Boolean isCA) {
		this.isCA = isCA;
	}

	@JsonProperty("kind")
	CertificateKinds getKind() {
		return kind;
	}
	void setKind(CertificateKinds kind) {
		this.kind = kind;
	}

	@JsonProperty("format")
	CertificateFormats getFormat() {
		return format;
	}
	void setFormat(CertificateFormats format) {
		this.format = format;
	}
}
