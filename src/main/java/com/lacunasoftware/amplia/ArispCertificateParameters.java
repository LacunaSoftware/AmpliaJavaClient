package com.lacunasoftware.amplia;

public class ArispCertificateParameters extends CertificateParameters {
	private String nome;
	private String cpf;
	private ArispRoles funcao;
	private ArispCartorioInfo cartorio;

	public ArispCertificateParameters() {
		super();
		this.format = CertificateFormats.ARISP;
	}

	ArispCertificateParameters (ArispCertificateParametersModel model) {
		this();
		this.nome = model.getNome();
		this.cpf = model.getCpf();

		if (model.getFuncao() != null) {
			switch (model.getFuncao()) {
				case Tabeliao:
					this.funcao = ArispRoles.TABELIAO;
					break;
				case Substituto:
					this.funcao = ArispRoles.SUBSTITUTO;
					break;
				case Escrevente:
					this.funcao = ArispRoles.ESCREVENTE;
					break;
				default:
					throw new IllegalArgumentException("Invalid value for \"funcao\" field on ArispCertificateParameters constructor.");
			}
		}

		if (model.getCartorio() != null) {
			this.cartorio = new ArispCartorioInfo(model.getCartorio());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArispRoles getFuncao() {
		return funcao;
	}

	public void setFuncao(ArispRoles funcao) {
		this.funcao = funcao;
	}

	public ArispCartorioInfo getCartorio() {
		return cartorio;
	}

	public void setCartorio(ArispCartorioInfo cartorio) {
		this.cartorio = cartorio;
	}

	@Override
	ArispCertificateParametersModel toModel() {
		ArispCertificateParametersModel model = (ArispCertificateParametersModel) super.toModel();
		model.setNome(nome);
		model.setCpf(cpf);
		model.setCartorio(cartorio.toModel());
		if (funcao != null) {
			model.setFuncao(ArispCertificateParametersModel.ArispRoles.valueOf(funcao.getValue()));
		}
		return model;
	}
}
