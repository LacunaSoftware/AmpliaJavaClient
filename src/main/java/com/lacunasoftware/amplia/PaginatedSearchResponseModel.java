package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
class PaginatedSearchResponseModel<T> {
	private List<T> items = null;
	private Integer totalCount = null;


	@JsonProperty("items")
	List<T> getItems() {
		return items;
	}
	void setItems(List<T> items) {
		this.items = items;
	}

	@JsonProperty("totalCount")
	Integer getTotalCount() {
		return totalCount;
	}
	void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}
