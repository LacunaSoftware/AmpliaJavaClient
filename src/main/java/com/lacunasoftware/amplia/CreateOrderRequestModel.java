package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateOrderRequestModel<TParametersModel extends CertificateParametersModel> {
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

	@JsonProperty("kind")
	public CertificateKinds getKind() {
		return kind;
	}
	public void setKind(CertificateKinds kind) {
		this.kind = kind;
	}

	@JsonProperty("copyFromCertificate")
	public String getCopyFromCertificate() {
		return copyFromCertificate;
	}
	public void setCopyFromCertificate(String copyFromCertificate) {
		this.copyFromCertificate = copyFromCertificate;
	}

	@JsonProperty("parameters")
	public TParametersModel getParameters() {
		return parameters;
	}
	public void setParameters(TParametersModel parameters) {
		this.parameters = parameters;
	}

	@JsonProperty("validityEnd")
	public String getValidityEnd() {
		return validityEnd;
	}
	public void setValidityEnd(String validityEnd) {
		this.validityEnd = validityEnd;
	}
}
