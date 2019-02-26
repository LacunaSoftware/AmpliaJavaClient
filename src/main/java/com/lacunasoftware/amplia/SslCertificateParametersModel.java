package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SslCertificateParametersModel extends CertificateParametersModel {
	private List<String> dnsNames;


	@JsonProperty("dnsNames")
	public List<String> getDnsNames() {
		return dnsNames;
	}
	public void setDnsNames(List<String> dnsNames) {
		this.dnsNames = dnsNames;
	}
}
