package com.lacunasoftware.amplia;

import java.util.List;


public class PkiBrazilCertificateParametersModel extends CertificateParametersModel {
	private String name;
	private String emailAddress;
	private String cnpj;
	private String companyName;
	private String cpf;
	private String birthDate;
	private String oabUF;
	private String oabNumero;
	private String rgEmissor;
	private String rgEmissorUF;
	private String rgNumero;
	private List<String> organizationUnits;
	private String organization;
	private String country;
	private String phoneNumber;

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

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
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

	public String getRgEmissor() {
		return rgEmissor;
	}

	public void setRgEmissor(String rgEmissor) {
		this.rgEmissor = rgEmissor;
	}

	public String getRgEmissorUF() {
		return rgEmissorUF;
	}

	public void setRgEmissorUF(String rgEmissorUF) {
		this.rgEmissorUF = rgEmissorUF;
	}

	public String getRgNumero() {
		return rgNumero;
	}

	public void setRgNumero(String rgNumero) {
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
}
