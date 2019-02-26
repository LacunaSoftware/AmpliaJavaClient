package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class BaseCertificateModel extends CertificateSummaryModel {

	private CertificateInfoModel info = null;
	private byte[] content = null;


	@JsonProperty("info")
	public CertificateInfoModel getInfo() {
		return info;
	}
	public void setInfo(CertificateInfoModel info) {
		this.info = info;
	}

	@JsonProperty("content")
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
}
