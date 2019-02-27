package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
class SslCertificateParametersModel extends CertificateParametersModel {
	private List<String> dnsNames;


	@JsonProperty("dnsNames")
	List<String> getDnsNames() {
		return dnsNames;
	}
	void setDnsNames(List<String> dnsNames) {
		this.dnsNames = dnsNames;
	}
}
