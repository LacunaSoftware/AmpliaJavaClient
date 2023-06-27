package com.lacunasoftware.amplia;

public class CieInstitution {
	private String name;
	private String city;
	private String state;

	public CieInstitution(CieInstitutionModel model) {
		this.name = model.getName();
		this.city = model.getCity();
		this.state = model.getState();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	CieInstitutionModel toModel() {
		CieInstitutionModel model = new CieInstitutionModel();
		model.setName(name);
		model.setCity(city);
		model.setState(state);
		return model;
	}
}
