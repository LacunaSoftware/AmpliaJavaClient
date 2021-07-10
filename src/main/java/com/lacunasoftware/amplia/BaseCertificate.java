package com.lacunasoftware.amplia;

import java.util.Date;
import java.util.List;

public class BaseCertificate {
	private String id;
	private String caId;
	private Name subjectName;
	private String alias;
	private String emailAddress;
	private Name issuerName;
	private String serialNumber;
	private Date validityStart;
	private Date validityEnd;
	private List<String> crlDistributionPoints;
	private List<String> ocspUris;
	private byte[] content;
	private CertificateKinds kind;
	private CertificateFormats format;


	BaseCertificate(BaseCertificateModel model) {
		this.id = model.getId();
		this.caId = model.getCAId();
		this.alias = model.getAlias();
		this.content = model.getContent();

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

		if (model.getInfo() != null) {
			this.emailAddress = model.getInfo().getEmailAddress();
			this.serialNumber = model.getInfo().getSerialNumber();
			this.crlDistributionPoints = model.getInfo().getCrlDistributionPoints();
			this.ocspUris = model.getInfo().getOcspUris();

			if (model.getInfo().getValidityStart() != null) {
				this.validityStart = Util.parseApiDate(model.getInfo().getValidityStart());
			}

			if (model.getInfo().getValidityEnd() != null) {
				this.validityEnd = Util.parseApiDate(model.getInfo().getValidityEnd());
			}

			if (model.getInfo().getSubjectName() != null) {
				this.subjectName = new Name(model.getInfo().getSubjectName());
			}

			if (model.getInfo().getSubjectName() != null) {
				this.issuerName = new Name(model.getInfo().getSubjectName());
			}
		}
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getCAId() {
		return caId;
	}
	public void setCAId(String caId) {
		this.caId = caId;
	}

	public Name getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(Name subjectName) {
		this.subjectName = subjectName;
	}

	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Name getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(Name issuerName) {
		this.issuerName = issuerName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Date getValidityStart() {
		return validityStart;
	}
	public void setValidityStart(Date validityStart) {
		this.validityStart = validityStart;
	}

	public Date getValidityEnd() {
		return validityEnd;
	}
	public void setValidityEnd(Date validityEnd) {
		this.validityEnd = validityEnd;
	}

	public List<String> getCrlDistributionPoints() {
		return crlDistributionPoints;
	}
	public void setCrlDistributionPoints(List<String> crlDistributionPoints) {
		this.crlDistributionPoints = crlDistributionPoints;
	}

	public List<String> getOcspUris() {
		return ocspUris;
	}
	public void setOcspUris(List<String> ocspUris) {
		this.ocspUris = ocspUris;
	}

	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
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

