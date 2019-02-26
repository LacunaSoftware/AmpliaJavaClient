package com.lacunasoftware.amplia;

public enum CertificateKinds {
	PUBLIC_KEY("PublicKey"),
	ATTRIBUTE("Attribute");

	private String value;


	CertificateKinds(String value) {
		this.value = value;
	}


	public String getValue() {
		return value;
	}
}
