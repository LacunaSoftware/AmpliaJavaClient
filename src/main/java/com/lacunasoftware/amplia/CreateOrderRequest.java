package com.lacunasoftware.amplia;


import java.text.SimpleDateFormat;
import java.util.Date;


public class CreateOrderRequest<TParameters extends CertificateParameters> {
	private String caId;
	private String templateId;
	private CertificateKinds kind;
	private byte[] copyFromCertificate;
	private TParameters parameters;
	private Date validityEnd;


	public String getCAId() {
		return caId;
	}

	public void setCAId(String caId) {
		this.caId = caId;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public CertificateKinds getKind() {
		return kind;
	}

	public void setKind(CertificateKinds kind) {
		this.kind = kind;
	}

	public byte[] getCopyFromCertificate() {
		return copyFromCertificate;
	}

	public void setCopyFromCertificate(byte[] copyFromCertificate) {
		this.copyFromCertificate = copyFromCertificate;
	}

	public TParameters getParameters() {
		return parameters;
	}

	public void setParameters(TParameters parameters) {
		this.parameters = parameters;
	}

	public Date getValidityEnd() {
		return validityEnd;
	}

	public void setValidityEnd(Date validityEnd) {
		this.validityEnd = validityEnd;
	}

	public CreateOrderRequestModel<CertificateParametersModel> toModel() {
		CreateOrderRequestModel<CertificateParametersModel> model = new CreateOrderRequestModel<>();
		model.setCAId(caId);
		model.setTemplateId(templateId);

		if (kind != null) {
			model.setKind(CreateOrderRequestModel.CertificateKinds.valueOf(kind.getValue()));
		}

		if (copyFromCertificate != null) {
			model.setCopyFromCertificate(Util.encodeBase64(copyFromCertificate));
		}

		if (parameters != null) {
			model.setParameters(parameters.toModel());
		}

		if (validityEnd != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
			model.setValidityEnd(formatter.format(validityEnd));
		}

		return model;
	}
}
