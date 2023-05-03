package com.lacunasoftware.amplia;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.security.InvalidParameterException;
import java.util.LinkedHashMap;


public abstract class CertificateParameters {
	protected CertificateFormats format;

	public CertificateFormats getFormat() {
		return format;
	}

	static String encode(CertificateParameters parameters) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		StringWriter writer = new StringWriter();
		mapper.writeValue(writer, parameters);
		return writer.toString();
	}

	static CertificateParameters decodeJson(String json) {
		Object obj;
		try {
			ObjectMapper mapper = new ObjectMapper();
			StringReader reader = new StringReader(json);
			obj = mapper.readValue(reader, Object.class);
		} catch(Exception ex) {
			throw new InvalidParameterException("Invalid template parameters JSON");
		}
		return decode(obj);
	}

	static CertificateParameters decode(Object value) {

		CertificateParametersModel.CertificateFormats format = CertificateParametersModel.CertificateFormats.valueOf(((LinkedHashMap) value).get("format").toString());
		ObjectMapper mapper = new ObjectMapper();

		switch (format) {
			case PkiBrazil:
				PkiBrazilCertificateParametersModel pkiBrazilModel = mapper.convertValue(value, PkiBrazilCertificateParametersModel.class);
				return new PkiBrazilCertificateParameters(pkiBrazilModel);
			case Ssl:
				SslCertificateParametersModel sslModel = mapper.convertValue(value, SslCertificateParametersModel.class);
				return new SslCertificateParameters(sslModel);
			case Cnb:
				CnbCertificateParametersModel cnbModel = mapper.convertValue(value, CnbCertificateParametersModel.class);
				return new CnbCertificateParameters(cnbModel);
			case CnbCA:
				CnbCACertificateParametersModel cnbCAModel = mapper.convertValue(value, CnbCACertificateParametersModel.class);
				return new CnbCACertificateParameters(cnbCAModel);
			case Cie:
				CieCertificateParametersModel cieModel = mapper.convertValue(value, CieCertificateParametersModel.class);
				return new CieCertificateParameters(cieModel);
			case Arisp:
				ArispCertificateParametersModel arispModel = mapper.convertValue(value, ArispCertificateParametersModel.class);
				return new ArispCertificateParameters(arispModel);
			case Latinus:
				LatinusCertificateParametersModel latinusModel = mapper.convertValue(value, LatinusCertificateParametersModel.class);
				return new LatinusCertificateParameters(latinusModel);
		}

		throw new InvalidParameterException(String.format("Certificate format not supported: %s", format.toString()));
	}

	protected void fillModel(CertificateParametersModel model) {
		model.setFormat(CertificateParametersModel.CertificateFormats.valueOf(format.getValue()));
	}

	abstract CertificateParametersModel toModel();
}
