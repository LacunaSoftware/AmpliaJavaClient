package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class CreateOrderRequestModel<TParametersModel extends CertificateParametersModel> {
	public enum CertificateKinds {
		PublicKey, Attribute
	}

	private String caId;
	private String templateId;
	private CertificateKinds kind;
	private String copyFromCertificate;
	private TParametersModel parameters;
	private String validityEnd;


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

	@JsonProperty("kind")
	CertificateKinds getKind() {
		return kind;
	}
	void setKind(CertificateKinds kind) {
		this.kind = kind;
	}

	@JsonProperty("copyFromCertificate")
	String getCopyFromCertificate() {
		return copyFromCertificate;
	}
	void setCopyFromCertificate(String copyFromCertificate) {
		this.copyFromCertificate = copyFromCertificate;
	}

	@JsonProperty("parameters")
	TParametersModel getParameters() {
		return parameters;
	}
	void setParameters(TParametersModel parameters) {
		this.parameters = parameters;
	}

	@JsonProperty("validityEnd")
	String getValidityEnd() {
		return validityEnd;
	}
	void setValidityEnd(String validityEnd) {
		this.validityEnd = validityEnd;
	}
}
