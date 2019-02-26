package com.lacunasoftware.amplia;

import java.util.List;

public class SslCertificateParameters extends CertificateParameters {
	private List<String> dnsNames;


	public SslCertificateParameters() {
		super();
		this.format = CertificateFormats.SSL;
	}

	SslCertificateParameters(SslCertificateParametersModel model) {
		this();
		this.dnsNames = model.getDnsNames();
	}


	public List<String> getDnsNames() {
		return dnsNames;
	}

	public void setDnsNames(List<String> dnsNames) {
		this.dnsNames = dnsNames;
	}

	public SslCertificateParametersModel toModel() {
		SslCertificateParametersModel model = (SslCertificateParametersModel) super.toModel();
		model.setDnsNames(dnsNames);
		return model;
	}
}
