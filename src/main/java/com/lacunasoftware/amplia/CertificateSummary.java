package com.lacunasoftware.amplia;


import java.util.Date;


public class CertificateSummary {
	private String id;
	private String subscriptionId;
	private String caId;
	private String keyId;
	private Date dateIssued;
	private Date dateExpires;
	private Date dateRevoked;
	private String alias;
	private String subjectDisplayName;
	private String serialNumber;
	private boolean isCA;
	private CertificateKinds kind;
	private CertificateFormats format;

	CertificateSummary(CertificateSummaryModel model) {
		this.id = model.getId();
		this.subscriptionId = model.getSubscriptionId();
		this.caId = model.getCAId();
		this.keyId = model.getKeyId();
		this.alias = model.getAlias();
		this.subjectDisplayName = model.getSubjectDisplayName();
		this.serialNumber = model.getSerialNumber();
		this.isCA = model.isCA();

		if (model.getDateIssued() != null) {
			this.dateIssued = Util.parseApiDate(model.getDateIssued());
		}

		if (model.getDateExpires() != null) {
			this.dateExpires = Util.parseApiDate(model.getDateExpires());
		}

		if (model.getDateRevoked() != null) {
			this.dateRevoked = Util.parseApiDateWithMillis(model.getDateRevoked());
		}

		if (model.getKind() != null) {
			switch (model.getKind()) {
				case PublicKey:
					this.kind = CertificateKinds.PUBLIC_KEY;
					break;
				case Attribute:
					this.kind = CertificateKinds.ATTRIBUTE;
					break;
				default:
					throw new IllegalArgumentException("Invalid value for \"kind\" field on BaseCertificate constructor.");
			}
		}

		if (model.getFormat() != null) {
			switch (model.getFormat()) {
				case PkiBrazil:
					this.format = CertificateFormats.PKI_BRAZIL;
					break;
				case Ssl:
					this.format = CertificateFormats.SSL;
					break;
				case Cnb:
					this.format = CertificateFormats.CNB;
					break;
				case CnbCA:
					this.format = CertificateFormats.CNB_CA;
					break;
				case Cie:
					this.format = CertificateFormats.CIE;
					break;
				case Arisp:
					this.format = CertificateFormats.ARISP;
					break;
				case Latinus:
					this.format = CertificateFormats.LATINUS;
					break;
				default:
					throw new IllegalArgumentException("Invalid value for \"format\" field on BaseCertificate constructor.");
			}
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
		this.caId = caId;
	}

	public String getKeyId() {
		return keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	public Date getDateExpires() {
		return dateExpires;
	}

	public void setDateExpires(Date dateExpires) {
		this.dateExpires = dateExpires;
	}

	public Date getDateRevoked() {
		return dateRevoked;
	}

	public void setDateRevoked(Date dateRevoked) {
		this.dateRevoked = dateRevoked;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getSubjectDisplayName() {
		return subjectDisplayName;
	}

	public void setSubjectDisplayName(String subjectDisplayName) {
		this.subjectDisplayName = subjectDisplayName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public boolean isCA() {
		return isCA;
	}

	public void setCA(boolean CA) {
		isCA = CA;
	}

	public CertificateKinds getKind() {
		return kind;
	}

	public void setKind(CertificateKinds kind) {
		this.kind = kind;
	}

	public CertificateFormats getFormat() {
		return format;
	}

	public void setFormat(CertificateFormats format) {
		this.format = format;
	}
}
