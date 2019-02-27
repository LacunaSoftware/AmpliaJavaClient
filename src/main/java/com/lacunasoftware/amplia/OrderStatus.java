package com.lacunasoftware.amplia;


public enum OrderStatus {
	PENDING("Pending"),
	LOCKET("Locket"),
	ISSUED("Issued");

	private String value;

	OrderStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
