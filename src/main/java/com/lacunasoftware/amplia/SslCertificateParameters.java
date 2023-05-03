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

	SslCertificateParametersModel toModel() {
		SslCertificateParametersModel model = new SslCertificateParametersModel();
		fillModel(model);
		model.setDnsNames(dnsNames);
		return model;
	}
}
