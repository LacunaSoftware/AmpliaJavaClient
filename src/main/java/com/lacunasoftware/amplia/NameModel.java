package com.lacunasoftware.amplia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
class NameModel {
	private String country = null;
	private String organization = null;
	private String organizationUnit = null;
	private String dnQualifier = null;
	private String stateName = null;
	private String commonName = null;
	private String serialNumber = null;
	private String locality = null;
	private String title = null;
	private String surname = null;
	private String givenName = null;
	private String initials = null;
	private String pseudonym = null;
	private String generationQualifier = null;
	private String emailAddress = null;
	private Map<String, List<String>> allValues = null;

	@JsonProperty("country")
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("organization")
	String getOrganization() {
		return organization;
	}
	void setOrganization(String organization) {
		this.organization = organization;
	}

	@JsonProperty("organizationUnit")
	String getOrganizationUnit() {
		return organizationUnit;
	}
	void setOrganizationUnit(String organizationUnit) {
		this.organizationUnit = organizationUnit;
	}

	@JsonProperty("dnQualifer")
	String getDNQualifier() {
		return dnQualifier;
	}
	void setDNQualifier(String dnQualifier) {
		this.dnQualifier = dnQualifier;
	}

	@JsonProperty("stateName")
	String getStateName() {
		return stateName;
	}
	void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@JsonProperty("commonName")
	String getCommonName() {
		return commonName;
	}
	void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	@JsonProperty("serialNumber")
	String getSerialNumber() {
		return serialNumber;
	}
	void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@JsonProperty("locality")
	String getLocality() {
		return locality;
	}
	void setLocality(String locality) {
		this.locality = locality;
	}

	@JsonProperty("title")
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("surname")
	String getSurname() {
		return surname;
	}
	void setSurname(String surname) {
		this.surname = surname;
	}

	@JsonProperty("givenName")
	String getGivenName() {
		return givenName;
	}
	void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	@JsonProperty("initials")
	String getInitials() {
		return initials;
	}
	void setInitials(String initials) {
		this.initials = initials;
	}

	@JsonProperty("pseudonym")
	String getPseudonym() {
		return pseudonym;
	}
	void setPseudonym(String pseudonym) {
		this.pseudonym = pseudonym;
	}

	@JsonProperty("generationQualifier")
	String getGenerationQualifier() {
		return generationQualifier;
	}
	void setGenerationQualifier(String generationQualifier) {
		this.generationQualifier = generationQualifier;
	}

	@JsonProperty("emailAddress")
	String getEmailAddress() {
		return emailAddress;
	}
	void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@JsonProperty("allValues")
	Map<String, List<String>> getAllValues() {
		return allValues;
	}
	void setAllValues(Map<String, List<String>> allValues) {
		this.allValues = allValues;
	}
}
