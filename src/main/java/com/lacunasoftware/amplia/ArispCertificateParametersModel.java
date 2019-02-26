package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ArispCertificateParametersModel extends CertificateParametersModel {
	public enum ArispRoles {
		Tabeliao, Substituto, Escrevente
	}

	private String nome = null;
	private String cpf = null;
	private ArispRoles funcao = null;
	private ArispCartorioInfoModel cartorio = null;


	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("cpf")
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@JsonProperty("funcao")
	public ArispRoles getFuncao() {
		return funcao;
	}
	public void setFuncao(ArispRoles funcao) {
		this.funcao = funcao;
	}

	@JsonProperty("cartorio")
	public ArispCartorioInfoModel getCartorio() {
		return cartorio;
	}
	public void setCartorio(ArispCartorioInfoModel cartorio) {
		this.cartorio = cartorio;
	}
}
