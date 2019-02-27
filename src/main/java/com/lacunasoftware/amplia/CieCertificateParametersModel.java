package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
class CieCertificateParametersModel extends CertificateParametersModel {
	private String name = null;
	private String eea = null;
	private String birthDate = null;
	private String cpf = null;
	private String registrationNumber = null;
	private String idNumber = null;
	private String idIssuer = null;
	private String idIssuerState = null;
	private CieInstitutionModel institution = null;
	private String degree = null;
	private String course = null;


	@JsonProperty("name")
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}

	@JsonProperty("eea")
	String getEea() {
		return eea;
	}
	void setEea(String eea) {
		this.eea = eea;
	}

	@JsonProperty("birthDate")
	String getBirthDate() {
		return birthDate;
	}
	void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@JsonProperty("cpf")
	String getCpf() {
		return cpf;
	}
	void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@JsonProperty("registrationNumber")
	String getRegistrationNumber() {
		return registrationNumber;
	}
	void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@JsonProperty("idNumber")
	String getIdNumber() {
		return idNumber;
	}
	void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@JsonProperty("idIssuer")
	String getIdIssuer() {
		return idIssuer;
	}
	void setIdIssuer(String idIssuer) {
		this.idIssuer = idIssuer;
	}

	@JsonProperty("idIssuerState")
	String getIdIssuerState() {
		return idIssuerState;
	}
	void setIdIssuerState(String idIssuerState) {
		this.idIssuerState = idIssuerState;
	}

	@JsonProperty("institution")
	CieInstitutionModel getInstitution() {
		return institution;
	}
	void setInstitution(CieInstitutionModel institution) {
		this.institution = institution;
	}

	@JsonProperty("degree")
	String getDegree() {
		return degree;
	}
	void setDegree(String degree) {
		this.degree = degree;
	}

	@JsonProperty("course")
	String getCourse() {
		return course;
	}
	void setCourse(String course) {
		this.course = course;
	}
}
