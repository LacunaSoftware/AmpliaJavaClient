package com.lacunasoftware.amplia;


public class CnbCACertificateParameters extends CertificateParameters {
	private String name;
	private String cns;
	private String streetAddress;
	private String locality;
	private String stateName;
	private String postalCode;


	public CnbCACertificateParameters() {
		super();
		this.format = CertificateFormats.CNB_CA;
	}

	CnbCACertificateParameters(CnbCACertificateParametersModel model) {
		this();
		this.name = model.getName();
		this.cns = model.getCns();
		this.streetAddress = model.getStreetAddress();
		this.locality = model.getLocality();
		this.stateName = model.getStateName();
		this.postalCode = model.getPostalCode();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCns() {
		return cns;
	}

	public void setCns(String cns) {
		this.cns = cns;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	CnbCACertificateParametersModel toModel() {
		CnbCACertificateParametersModel model = (CnbCACertificateParametersModel) super.toModel();
		model.setName(name);
		model.setCns(cns);
		model.setStreetAddress(streetAddress);
		model.setLocality(locality);
		model.setStateName(stateName);
		model.setPostalCode(postalCode);
		return model;
	}
}
