package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderSummaryModel {
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

	@JsonProperty("dateCreated")
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	@JsonProperty("caId")
	public String getCAId() {
		return caId;
	}
	public void setCAId(String caId) {
		this.caId = caId;
	}

	@JsonProperty("templateId")
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	@JsonProperty("alias")
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	@JsonProperty("emailAddress")
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@JsonProperty("certificateId")
	public String getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	@JsonProperty("status")
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
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
