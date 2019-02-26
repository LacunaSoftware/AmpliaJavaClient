package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ArispCartorioInfoModel {
	private String cns = null;
	private String numero = null;
	private String nome = null;
	private String oficial = null;
	private ArispEnderecoModel endereco = null;
	private String telefone = null;
	private String site = null;
	private String email = null;


	@JsonProperty("cns")
	public String getCns() {
		return cns;
	}
	public void setCns(String cns) {
		this.cns = cns;
	}

	@JsonProperty("numero")
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("oficial")
	public String getOficial() {
		return oficial;
	}
	public void setOficial(String oficial) {
		this.oficial = oficial;
	}

	@JsonProperty("endereco")
	public ArispEnderecoModel getEndereco() {
		return endereco;
	}
	public void setEndereco(ArispEnderecoModel endereco) {
		this.endereco = endereco;
	}

	@JsonProperty("telefone")
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@JsonProperty("site")
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
