package com.lacunasoftware.amplia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
class PkiBrazilCertificateParametersModel extends CertificateParametersModel {
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

	@JsonProperty("name")
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}

	@JsonProperty("emailAddress")
	String getEmailAddress() {
		return emailAddress;
	}
	void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@JsonProperty("cnpj")
	String getCnpj() {
		return cnpj;
	}
	void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@JsonProperty("companyName")
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("cpf")
	String getCpf() {
		return cpf;
	}
	void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@JsonProperty("birthDate")
	String getBirthDate() {
		return birthDate;
	}
	void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@JsonProperty("oabUF")
	String getOabUF() {
		return oabUF;
	}
	void setOabUF(String oabUF) {
		this.oabUF = oabUF;
	}

	@JsonProperty("oabNumero")
	String getOabNumero() {
		return oabNumero;
	}
	void setOabNumero(String oabNumero) {
		this.oabNumero = oabNumero;
	}

	@JsonProperty("rgEmissor")
	String getRgEmissor() {
		return rgEmissor;
	}
	void setRgEmissor(String rgEmissor) {
		this.rgEmissor = rgEmissor;
	}

	@JsonProperty("rgEmissorUF")
	String getRgEmissorUF() {
		return rgEmissorUF;
	}
	void setRgEmissorUF(String rgEmissorUF) {
		this.rgEmissorUF = rgEmissorUF;
	}

	@JsonProperty("rgNumero")
	String getRgNumero() {
		return rgNumero;
	}
	void setRgNumero(String rgNumero) {
		this.rgNumero = rgNumero;
	}

	@JsonProperty("organizationUnits")
	List<String> getOrganizationUnits() {
		return organizationUnits;
	}
	void setOrganizationUnits(List<String> organizationUnits) {
		this.organizationUnits = organizationUnits;
	}

	@JsonProperty("organization")
	String getOrganization() {
		return organization;
	}
	void setOrganization(String organization) {
		this.organization = organization;
	}

	@JsonProperty("country")
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("phoneNumber")
	String getPhoneNumber() {
		return phoneNumber;
	}
	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
