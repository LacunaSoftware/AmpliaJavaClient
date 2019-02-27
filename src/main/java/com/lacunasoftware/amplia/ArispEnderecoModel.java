package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class ArispEnderecoModel {
	private String logradouro = null;
	private String numero = null;
	private String complemento = null;
	private String distrito = null;
	private String comarca = null;
	private String municipio = null;
	private String estado = null;
	private String cep = null;


	@JsonProperty("logradouro")
	String getLogradouro() {
		return logradouro;
	}
	void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@JsonProperty("numero")
	String getNumero() {
		return numero;
	}
	void setNumero(String numero) {
		this.numero = numero;
	}

	@JsonProperty("complemento")
	String getComplemento() {
		return complemento;
	}
	void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@JsonProperty("distrito")
	String getDistrito() {
		return distrito;
	}
	void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	@JsonProperty("comarca")
	String getComarca() {
		return comarca;
	}
	void setComarca(String comarca) {
		this.comarca = comarca;
	}

	@JsonProperty("municipio")
	String getMunicipio() {
		return municipio;
	}
	void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	@JsonProperty("estado")
	String getEstado() {
		return estado;
	}
	void setEstado(String estado) {
		this.estado = estado;
	}

	@JsonProperty("cep")
	String getCep() {
		return cep;
	}
	void setCep(String cep) {
		this.cep = cep;
	}
}
