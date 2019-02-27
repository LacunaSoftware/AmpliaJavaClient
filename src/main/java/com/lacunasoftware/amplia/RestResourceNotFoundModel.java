package com.lacunasoftware.amplia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class RestResourceNotFoundModel extends RestGeneralErrorModel {
	private String resourceName = null;
	private String resourceId = null;

	@JsonProperty("resourceName")
	String getResourceName() {
		return resourceName;
	}
	void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	@JsonProperty("resourceId")
	String getResourceId() {
		return resourceId;
	}
	void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
}
