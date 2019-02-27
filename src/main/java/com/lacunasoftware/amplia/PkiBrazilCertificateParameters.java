package com.lacunasoftware.amplia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PkiBrazilCertificateParameters extends CertificateParameters {
	private String name;
	private String emailAddress;
	private String cnpj;
	private String companyName;
	private String cpf;
	private Date birthDate;
	private String oabUF;
	private String oabNumero;
	private String rgEmissor;
	private String rgEmissorUF;
	private String rgNumero;
	private List<String> organizationUnits;
	private String organization;
	private String country;
	private String phoneNumber;


	public PkiBrazilCertificateParameters() {
		super();
		this.format = CertificateFormats.PKI_BRAZIL;
	}

	PkiBrazilCertificateParameters(PkiBrazilCertificateParametersModel model) {
		this();
		this.name = model.getName();
		this.emailAddress = model.getEmailAddress();
		this.cnpj = model.getCnpj();
		this.companyName = model.getCompanyName();
		this.cpf = model.getCpf();
		this.oabUF = model.getOabUF();
		this.oabNumero = model.getOabNumero();
		this.rgEmissor = model.getRgEmissor();
		this.rgEmissorUF = model.getRgEmissorUF();
		this.rgNumero = model.getRgNumero();
		this.organizationUnits = model.getOrganizationUnits();
		this.organization = model.getOrganization();
		this.country = model.getCountry();
		this.phoneNumber = model.getPhoneNumber();

		if (model.getBirthDate() != null) {
			this.birthDate = Util.parseApiDate(model.getBirthDate());
		}
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getCnpjFormatted() {
		if (cnpj == null || cnpj.isEmpty()) {
			return "";
		}
		if (!cnpj.matches("^\\d{14}$")) {
			return cnpj;
		}
		return String.format("%s.%s.%s/%s-%s", cnpj.substring(0, 2), cnpj.substring(2, 5), cnpj.substring(5, 8), cnpj.substring(8, 12), cnpj.substring(12));
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCpfFormatted() {
		if (cpf == null || cpf.isEmpty()) {
			return "";
		}
		if (!cpf.matches("^\\d{11}$")) {
			return cpf;
		}
		return String.format("%s.%s.%s-%s", cpf.substring(0, 3), cpf.substring(3, 6), cpf.substring(6, 9), cpf.substring(9));
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getOabUF() {
		return oabUF;
	}

	public void setOabUF(String oabUF) {
		this.oabUF = oabUF;
	}

	public String getOabNumero() {
		return oabNumero;
	}

	public void setOabNumero(String oabNumero) {
		this.oabNumero = oabNumero;
	}

	public String getRGEmissor() {
		return rgEmissor;
	}

	public void setRGEmissor(String rgEmissor) {
		this.rgEmissor = rgEmissor;
	}

	public String getRGEmissorUF() {
		return rgEmissorUF;
	}

	public void setRGEmissorUF(String rgEmissorUF) {
		this.rgEmissorUF = rgEmissorUF;
	}

	public String getRGNumero() {
		return rgNumero;
	}

	public void setRGNumero(String rgNumero) {
		this.rgNumero = rgNumero;
	}

	public List<String> getOrganizationUnits() {
		return organizationUnits;
	}

	public void setOrganizationUnits(List<String> organizationUnits) {
		this.organizationUnits = organizationUnits;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PkiBrazilCertificateParametersModel toModel() {
		PkiBrazilCertificateParametersModel model = new PkiBrazilCertificateParametersModel();
		model.setName(name);
		model.setEmailAddress(emailAddress);
		model.setCnpj(cnpj);
		model.setCompanyName(companyName);
		model.setCpf(cpf);
		if (birthDate != null) {
			model.setBirthDate(Util.formatToApiDate(birthDate));
		}
		model.setOabUF(oabUF);
		model.setOabNumero(oabNumero);
		model.setRgEmissor(rgEmissor);
		model.setRgEmissorUF(rgEmissorUF);
		model.setRgNumero(rgNumero);
		model.setOrganizationUnits(organizationUnits);
		model.setOrganization(organization);
		model.setCountry(country);
		model.setPhoneNumber(phoneNumber);
		return model;
	}
}
