package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class BaseOrderModel extends OrderSummaryModel {
	private Boolean canDelete = null;
	private Boolean canEdit = null;

	@JsonProperty("canDelete")
	boolean isCanDelete() {
		return canDelete;
	}
	void setCanDelete(boolean canDelete) {
		this.canDelete = canDelete;
	}

	@JsonProperty("canEdit")
	boolean isCanEdit() {
		return canEdit;
	}
	void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}
}
