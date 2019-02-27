package com.lacunasoftware.amplia;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

class RestClient {
	private String endpointUrl;
	private String apiKey;

	RestClient(String endpointUrl) {
		this.endpointUrl = endpointUrl;
	}

	RestClient(String endpointUrl, String apiKey) {
		this.endpointUrl = endpointUrl;
		this.apiKey = apiKey;
	}

	<TResponse> TResponse get(String requestUri, final Class<TResponse> valueType) throws RestException {
		return get(requestUri, new TypeReference<TResponse>() {
			@Override
			public Type getType() {
				return valueType;
			}
		});
	}

	<TResponse> TResponse get(String requestUri, TypeReference<TResponse> typeReference) throws RestException {

		String verb = "GET";
		String requestUrl = endpointUrl + requestUri;
		HttpURLConnection conn;

		try {

			URL url = new URL(requestUrl);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(verb);
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("X-Api-Key", apiKey);

		} catch (Exception e) {
			throw new RestUnreachableException(verb, requestUrl, e);
		}
		checkResponse(verb, requestUrl, conn);

		TResponse response;
		try {
			response = readResponse(conn, typeReference);
		} catch (Exception e) {
			throw new RestDecodeException(verb, requestUrl, e);
		}

		conn.disconnect();
		return response;
	}

	<TRequest, TResponse> TResponse post(String requestUri, TRequest request, final Class<TResponse> valueType) throws RestException {
		return post(requestUri, request, new TypeReference<TResponse>() {
			@Override
			public Type getType() {
				return valueType;
			}
		});
	}

	<TRequest, TResponse> TResponse post(String requestUri, TRequest request, TypeReference<TResponse> typeReference) throws RestException {

		String verb = "POST";
		String requestUrl = endpointUrl + requestUri;
		HttpURLConnection conn;

		try {

			URL url = new URL(requestUrl);
			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod(verb);
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("X-Api-Key", apiKey);

			OutputStream outStream = conn.getOutputStream();
			if (request != null) {
				new ObjectMapper().writeValue(outStream, request);
			}
			outStream.close();

		} catch (Exception e) {
			throw new RestUnreachableException(verb, requestUrl, e);
		}
		checkResponse(verb, requestUrl, conn);

		TResponse response = null;
		try {
			if (typeReference != null) {
				response = readResponse(conn, typeReference);
			}
		} catch (Exception e) {
			throw new RestDecodeException(verb, requestUrl, e);
		}

		conn.disconnect();
		return response;
	}

	void delete(String requestUri) throws RestException {

		String verb = "DELETE";
		String requestUrl = endpointUrl + requestUri;
		HttpURLConnection conn;

		try {

			URL url = new URL(requestUrl);
			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod(verb);
			conn.setRequestProperty("X-Api-Key", apiKey);

		} catch (Exception e) {
			throw new RestUnreachableException(verb, requestUrl, e);
		}
		checkResponse(verb, requestUrl, conn);

		conn.disconnect();
	}

	private void checkResponse(String verb, String url, HttpURLConnection conn) throws RestException {

		int statusCode;

		try {
			statusCode = conn.getResponseCode();
		} catch (Exception e) {
			throw new RestUnreachableException(verb, url, e);
		}

		if (statusCode < 200 || statusCode > 299) {

			RestException ex = null;

			try {

				if (statusCode == 404) {

					RestResourceNotFoundModel model = readErrorResponse(conn, RestResourceNotFoundModel.class);
					if (model != null) {
						if (model.getResourceName() != null && model.getResourceId() != null) {
							ex = new RestResourceNotFoundException(verb, url, model.getResourceName(), model.getResourceId());
						} else {
							ex = new RestErrorException(verb, url, statusCode, model.getMessage());
						}
					}

				} else {

					RestGeneralErrorModel model = readErrorResponse(conn, RestGeneralErrorModel.class);
					if (model != null && model.getMessage() != null) {
						ex = new RestErrorException(verb, url, statusCode, model.getMessage());
					}

				}

			} catch (Exception e) {
				// do nothing
				//throw new RuntimeException("Error decoding error", e);
			}

			if (ex == null) {
				ex = new RestErrorException(verb, url, statusCode);
			}
			throw ex;
		}
	}

	private <T> T readResponse(HttpURLConnection conn, Class<T> valueType) throws IOException {
		InputStream inStream = conn.getInputStream();
		T response = new ObjectMapper().readValue(inStream, valueType);
		inStream.close();
		return response;
	}

	private <T> T readResponse(HttpURLConnection conn, TypeReference<T> typeReference) throws IOException {
		InputStream inStream = conn.getInputStream();
		T response = new ObjectMapper().readValue(inStream, typeReference);
		inStream.close();
		return response;
	}

	private <T> T readErrorResponse(HttpURLConnection conn, Class<T> valueType) throws IOException {
		InputStream inStream = conn.getErrorStream();
		T response = new ObjectMapper().readValue(inStream, valueType);
		inStream.close();
		return response;
	}

	private <T> T readErrorResponse(HttpURLConnection conn, TypeReference<T> typeReference) throws IOException {
		InputStream inStream = conn.getErrorStream();
		T response = new ObjectMapper().readValue(inStream, typeReference);
		inStream.close();
		return response;
	}
}