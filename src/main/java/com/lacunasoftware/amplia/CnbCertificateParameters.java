package com.lacunasoftware.amplia;

public class CnbCertificateParameters extends CertificateParameters {
	private String phoneNumber;


	public CnbCertificateParameters() {
		super();
		this.format = CertificateFormats.CNB;
	}

	CnbCertificateParameters(CnbCertificateParametersModel model) {
		this();
		this.phoneNumber = model.getPhoneNumber();
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	CnbCertificateParametersModel toModel() {
		CnbCertificateParametersModel model = (CnbCertificateParametersModel) super.toModel();
		model.setPhoneNumber(phoneNumber);
		return model;
	}
}
