package com.lacunasoftware.amplia;

public enum ArispRoles {
	TABELIAO("Tabeliao"),
	SUBSTITUTO("Substituto"),
	ESCREVENTE("Escrevente");

	private String value;

	ArispRoles(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
