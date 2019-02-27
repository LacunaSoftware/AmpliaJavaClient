package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class ArispCartorioInfoModel {
	private String cns = null;
	private String numero = null;
	private String nome = null;
	private String oficial = null;
	private ArispEnderecoModel endereco = null;
	private String telefone = null;
	private String site = null;
	private String email = null;


	@JsonProperty("cns")
	String getCns() {
		return cns;
	}
	void setCns(String cns) {
		this.cns = cns;
	}

	@JsonProperty("numero")
	String getNumero() {
		return numero;
	}
	void setNumero(String numero) {
		this.numero = numero;
	}

	@JsonProperty("nome")
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("oficial")
	String getOficial() {
		return oficial;
	}
	void setOficial(String oficial) {
		this.oficial = oficial;
	}

	@JsonProperty("endereco")
	ArispEnderecoModel getEndereco() {
		return endereco;
	}
	void setEndereco(ArispEnderecoModel endereco) {
		this.endereco = endereco;
	}

	@JsonProperty("telefone")
	String getTelefone() {
		return telefone;
	}
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@JsonProperty("site")
	String getSite() {
		return site;
	}
	void setSite(String site) {
		this.site = site;
	}

	@JsonProperty("email")
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
}
