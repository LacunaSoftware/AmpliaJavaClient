package com.lacunasoftware.amplia;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CieCertificateParametersModel extends CertificateParametersModel {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("eea")
	public String getEea() {
		return eea;
	}
	public void setEea(String eea) {
		this.eea = eea;
	}

	@JsonProperty("birthDate")
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@JsonProperty("cpf")
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@JsonProperty("registrationNumber")
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@JsonProperty("idNumber")
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@JsonProperty("idIssuer")
	public String getIdIssuer() {
		return idIssuer;
	}
	public void setIdIssuer(String idIssuer) {
		this.idIssuer = idIssuer;
	}

	@JsonProperty("idIssuerState")
	public String getIdIssuerState() {
		return idIssuerState;
	}
	public void setIdIssuerState(String idIssuerState) {
		this.idIssuerState = idIssuerState;
	}

	@JsonProperty("institution")
	public CieInstitutionModel getInstitution() {
		return institution;
	}
	public void setInstitution(CieInstitutionModel institution) {
		this.institution = institution;
	}

	@JsonProperty("degree")
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}

	@JsonProperty("course")
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
