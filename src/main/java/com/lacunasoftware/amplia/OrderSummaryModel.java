package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class OrderSummaryModel {
	public enum OrderStatus {
		Pending, Locket, Issued
	}
	public enum CertificateKinds {
		PublicKey, Attribute
	}
	public enum CertificateFormats {
		PkiBrazil, Ssl, Cnb, CnbCA, Cie, Arisp
	}

	private String id = null;
	private String subscriptionId = null;
	private String dateCreated = null;
	private String caId = null;
	private String templateId = null;
	private String alias = null;
	private String emailAddress = null;
	private String certificateId = null;
	private OrderStatus status = null;
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

	@JsonProperty("dateCreated")
	String getDateCreated() {
		return dateCreated;
	}
	void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	@JsonProperty("caId")
	String getCAId() {
		return caId;
	}
	void setCAId(String caId) {
		this.caId = caId;
	}

	@JsonProperty("templateId")
	String getTemplateId() {
		return templateId;
	}
	void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	@JsonProperty("alias")
	String getAlias() {
		return alias;
	}
	void setAlias(String alias) {
		this.alias = alias;
	}

	@JsonProperty("emailAddress")
	String getEmailAddress() {
		return emailAddress;
	}
	void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@JsonProperty("certificateId")
	String getCertificateId() {
		return certificateId;
	}
	void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	@JsonProperty("status")
	OrderStatus getStatus() {
		return status;
	}
	void setStatus(OrderStatus status) {
		this.status = status;
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
