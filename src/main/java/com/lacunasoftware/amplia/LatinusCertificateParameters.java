package com.lacunasoftware.amplia;

import java.util.Date;
import java.util.List;

public class LatinusCertificateParameters extends CertificateParameters {
	private LatinusCertificateTypes type;
	private String name;
	private String emailAddress;
	private String cedulaDeIdentidad;
	private String passport;
	private String country;
	private String phoneNumber;
	private String companyName;
	private String ruc;
	private String rup;
	private List<String> organizationalUnits;
	private String organization;


	public LatinusCertificateParameters() {
		super();
		this.format = CertificateFormats.LATINUS;
	}

	LatinusCertificateParameters(LatinusCertificateParametersModel model) {
		this();
		
		if (model.getType() != null) {
			switch (model.getType()) {
				case PersonaNatural:
					this.type = LatinusCertificateTypes.PERSONA_NATURAL;
					break;
				case PersonaJuridica:
					this.type = LatinusCertificateTypes.PERSONA_JURIDICA;
					break;
				default:
					throw new IllegalArgumentException("Invalid value for \"type\" field on LatinusCertificateParameters constructor.");
			}
		}

		this.name = model.getName();
		this.emailAddress = model.getEmailAddress();
		this.cedulaDeIdentidad = model.getCedulaDeIdentidad();
		this.passport = model.getPassport();
		this.country = model.getCountry();
		this.phoneNumber = model.getPhoneNumber();
		this.companyName = model.getCompanyName();
		this.ruc = model.getRuc();
		this.rup = model.getRup();
		this.organizationalUnits = model.getOrganizationalUnits();
		this.organization = model.getOrganization();
	}

	public LatinusCertificateTypes getType() {
		return this.type;
	}

	public void setType(LatinusCertificateTypes type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getCedulaDeIdentidad() {
		return this.cedulaDeIdentidad;
	}

	public void setCedulaDeIdentidad(String cedulaDeIdentidad) {
		this.cedulaDeIdentidad = cedulaDeIdentidad;
	}

	public String getPassport() {
		return this.passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getRup() {
		return this.rup;
	}

	public void setRup(String rup) {
		this.rup = rup;
	}

	public List<String> getOrganizationalUnits() {
		return this.organizationalUnits;
	}

	public void setOrganizationalUnits(List<String> organizationalUnits) {
		this.organizationalUnits = organizationalUnits;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	LatinusCertificateParametersModel toModel() {
		LatinusCertificateParametersModel model = new LatinusCertificateParametersModel();
		if (type != null) {
			model.setType(LatinusCertificateParametersModel.LatinusCertificateTypes.valueOf(type.getValue()));
		}
		model.setName(name);
		model.setEmailAddress(emailAddress);
		model.setCedulaDeIdentidad(cedulaDeIdentidad);
		model.setPassport(passport);
		model.setCountry(country);
		model.setPhoneNumber(phoneNumber);
		model.setCompanyName(companyName);
		model.setRuc(ruc);
		model.setRup(rup);
		model.setOrganizationalUnits(organizationalUnits);
		model.setOrganization(organization);
		return model;
	}
}
