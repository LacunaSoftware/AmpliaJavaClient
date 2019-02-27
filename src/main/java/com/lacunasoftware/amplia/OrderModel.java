package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class OrderModel extends BaseOrderModel {
	private Object parameters = null;


	@JsonProperty("parameters")
	Object getParameters() {
		return parameters;
	}
	void setParameters(Object parameters) {
		this.parameters = parameters;
	}
}
