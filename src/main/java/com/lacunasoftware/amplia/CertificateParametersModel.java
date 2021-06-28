package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class CertificateParametersModel {
	public enum CertificateFormats {
		PkiBrazil, Ssl, Cnb, CnbCA, Cie, Arisp, Latinus
	}

	private CertificateFormats format = null;


	@JsonProperty("format")
	CertificateFormats getFormat() {
		return format;
	}
	void setFormat(CertificateFormats format) {
		this.format = format;
	}
}
