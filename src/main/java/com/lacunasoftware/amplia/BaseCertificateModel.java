package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class BaseCertificateModel extends CertificateSummaryModel {

	private CertificateInfoModel info = null;
	private byte[] content = null;


	@JsonProperty("info")
	CertificateInfoModel getInfo() {
		return info;
	}
	void setInfo(CertificateInfoModel info) {
		this.info = info;
	}

	@JsonProperty("content")
	byte[] getContent() {
		return content;
	}
	void setContent(byte[] content) {
		this.content = content;
	}
}
