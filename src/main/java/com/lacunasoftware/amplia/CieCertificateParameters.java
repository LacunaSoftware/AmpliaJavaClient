package com.lacunasoftware.amplia;


import java.util.Date;


public class CieCertificateParameters extends CertificateParameters {
	private String name;
	private String eea;
	private Date birthDate;
	private String cpf;
	private String registrationNumber;
	private String idNumber;
	private String idIssuer;
	private String idIssuerState;
	private CieInstitution institution;
	private String degree;
	private String course;


	public CieCertificateParameters() {
		super();
		this.format = CertificateFormats.CIE;
	}

	CieCertificateParameters(CieCertificateParametersModel model) {
		this();
		this.name = model.getName();
		this.eea = model.getEea();
		this.cpf = model.getCpf();
		this.registrationNumber = model.getRegistrationNumber();
		this.idNumber = model.getIdNumber();
		this.idIssuer = model.getIdIssuer();
		this.idIssuerState = model.getIdIssuerState();
		this.degree = model.getDegree();
		this.course = model.getCourse();

		if (model.getBirthDate() != null) {
			this.birthDate = Util.parseApiDate(model.getBirthDate());
		}

		if (model.getInstitution() != null) {
			this.institution = new CieInstitution(model.getInstitution());
		}
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEEA() {
		return eea;
	}

	public void setEEA(String eea) {
		this.eea = eea;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdIssuer() {
		return idIssuer;
	}

	public void setIdIssuer(String idIssuer) {
		this.idIssuer = idIssuer;
	}

	public String getIdIssuerState() {
		return idIssuerState;
	}

	public void setIdIssuerState(String idIssuerState) {
		this.idIssuerState = idIssuerState;
	}

	public CieInstitution getInstitution() {
		return institution;
	}

	public void setInstitution(CieInstitution institution) {
		this.institution = institution;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	CieCertificateParametersModel toModel() {
		CieCertificateParametersModel model = (CieCertificateParametersModel) super.toModel();
		model.setName(name);
		model.setEea(eea);
		if (birthDate != null) {
			model.setBirthDate(Util.formatToApiDate(birthDate));
		}
		model.setCpf(cpf);
		model.setRegistrationNumber(registrationNumber);
		model.setIdNumber(idNumber);
		model.setIdIssuer(idIssuer);
		model.setIdIssuerState(idIssuerState);
		model.setInstitution(institution.toModel());
		model.setDegree(degree);
		model.setCourse(course);
		return model;
	}
}
