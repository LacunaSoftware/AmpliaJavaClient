package com.lacunasoftware.amplia;

public class ArispCartorioInfo {
	private String cns;
	private String numero;
	private String nome;
	private String oficial;
	private ArispEndereco endereco;
	private String telefone;
	private String site;
	private String email;

	public ArispCartorioInfo() {

	}

	ArispCartorioInfo(ArispCartorioInfoModel model) {
		this.cns = model.getCns();
		this.numero = model.getNumero();
		this.nome = model.getNome();
		this.oficial = model.getOficial();
		this.telefone = model.getTelefone();
		this.site = model.getSite();
		this.email = model.getEmail();

		if (model.getEndereco() != null) {
			this.endereco = new ArispEndereco(model.getEndereco());
		}
	}


	public String getCns() {
		return cns;
	}

	public void setCns(String cns) {
		this.cns = cns;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOficial() {
		return oficial;
	}

	public void setOficial(String oficial) {
		this.oficial = oficial;
	}

	public ArispEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(ArispEndereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	ArispCartorioInfoModel toModel() {
		ArispCartorioInfoModel model = new ArispCartorioInfoModel();
		model.setCns(cns);
		model.setNumero(numero);
		model.setOficial(oficial);
		model.setEndereco(endereco.toModel());
		model.setTelefone(telefone);
		model.setSite(site);
		model.setEmail(email);
		return model;
	}
}
