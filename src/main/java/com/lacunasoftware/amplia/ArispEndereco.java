package com.lacunasoftware.amplia;

public class ArispEndereco {
	private String logradouro;
	private String numero;
	private String complemento;
	private String distrito;
	private String comarca;
	private String municipio;
	private String estado;
	private String cep;


	ArispEndereco(ArispEnderecoModel model) {
		this.logradouro = model.getLogradouro();
		this.numero = model.getNumero();
		this.complemento = model.getComplemento();
		this.distrito = model.getDistrito();
		this.comarca = model.getComarca();
		this.municipio = model.getMunicipio();
		this.estado = model.getEstado();
		this.cep = model.getCep();
	}


	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getComarca() {
		return comarca;
	}

	public void setComarca(String comarca) {
		this.comarca = comarca;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public ArispEnderecoModel toModel() {
		ArispEnderecoModel model = new ArispEnderecoModel();
		model.setLogradouro(logradouro);
		model.setNumero(numero);
		model.setComplemento(complemento);
		model.setDistrito(distrito);
		model.setComarca(comarca);
		model.setMunicipio(municipio);
		model.setEstado(estado);
		model.setCep(cep);
		return model;
	}
}
