package com.lacunasoftware.amplia;

public enum LatinusCertificateTypes {
	PERSONA_NATURAL("PersonaNatural"),
	PERSONA_JURIDICA("PersonaJuridica");

	private String value;

	LatinusCertificateTypes(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
