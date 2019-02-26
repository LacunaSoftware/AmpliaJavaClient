package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CertificateParametersModel {
	public enum CertificateFormats {
		PkiBrazil, Ssl, Cnb, CnbCA, Cie, Arisp
	}

	private CertificateFormats format = null;


	@JsonProperty("format")
	public CertificateFormats getFormat() {
		return format;
	}
	public void setFormat(CertificateFormats format) {
		this.format = format;
	}
}
