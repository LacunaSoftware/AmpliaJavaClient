package com.lacunasoftware.amplia;

public enum PaginationOrders {
	ASCENDING("Asc"),
	DESCENDING("Desc");

	private String value;

	PaginationOrders(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
