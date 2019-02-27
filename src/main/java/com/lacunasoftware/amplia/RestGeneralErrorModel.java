package com.lacunasoftware.amplia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class RestGeneralErrorModel {
	private String message = null;

	@JsonProperty("message")
	String getMessage() {
		return message;
	}
	void setMessage(String message) {
		this.message = message;
	}
}
