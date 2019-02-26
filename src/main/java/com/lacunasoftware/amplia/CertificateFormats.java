package com.lacunasoftware.amplia;

public enum CertificateFormats {
	PKI_BRAZIL("PkiBrazil"),
	SSL("Ssl"),
	CNB("Cnb"),
	CNB_CA("CnbCA"),
	CIE("Cie"),
	ARISP("Arisp");

	private String value;


	CertificateFormats(String value) {
		this.value = value;
	}


	public String getValue() {
		return value;
	}
}
