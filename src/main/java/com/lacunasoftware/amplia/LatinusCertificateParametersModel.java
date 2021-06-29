package com.lacunasoftware.amplia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
class LatinusCertificateParametersModel extends CertificateParametersModel {

	enum LatinusCertificateTypes {
		PersonaNatural, PersonaJuridica
	}

	private LatinusCertificateTypes type;
	private String name;
	private String emailAddress;
	private String companyName;
	private String cedulaDeIdentidad;
	private List<String> organizationalUnits;
	private String organization;
	private String phoneNumber;
	private String country;
	private String passport;
	private String ruc;
	private String rup;

	@JsonProperty("type")
	public LatinusCertificateTypes getType() {
		return type;
	}
	public void setType(LatinusCertificateTypes type) {
		this.type = type;
	}

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

	@JsonProperty("companyName")
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("organizationalUnits")
	List<String> getOrganizationalUnits() {
		return organizationalUnits;
	}
	void setOrganizationalUnits(List<String> organizationalUnits) {
		this.organizationalUnits = organizationalUnits;
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

	@JsonProperty("cedulaDeIdentidad")
	String getCedulaDeIdentidad() {
		return cedulaDeIdentidad;
	}
	void setCedulaDeIdentidad(String cedulaDeIdentidad) {
		this.cedulaDeIdentidad = cedulaDeIdentidad;
	}

	@JsonProperty("passport")
	String getPassport() {
		return passport;
	}
	void setPassport(String passport) {
		this.passport = passport;
	}

	@JsonProperty("ruc")
	String getRuc() {
		return ruc;
	}
	void setRuc(String ruc) {
		this.ruc = ruc;
	}

	@JsonProperty("rup")
	String getRup() {
		return rup;
	}
	void setRup(String rup) {
		this.rup = rup;
	}
}
