package com.lacunasoftware.amplia;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.*;

public class AmpliaClient {

	protected String apiKey;
	private String endpointUri;
	private RestClient restClient;
	private Map<CertificateFormats, String> typeApiRoutes;

	public AmpliaClient(String endpointUri, String apiKey) {
		this.endpointUri = endpointUri;
		this.apiKey = apiKey;
		typeApiRoutes = new HashMap<>();
		typeApiRoutes.put(CertificateFormats.PKI_BRAZIL, "pki-brazil");
		typeApiRoutes.put(CertificateFormats.SSL, "ssl");
		typeApiRoutes.put(CertificateFormats.CNB, "cnb");
		typeApiRoutes.put(CertificateFormats.CNB_CA, "cnb-ca");
		typeApiRoutes.put(CertificateFormats.CIE, "cie");
		typeApiRoutes.put(CertificateFormats.ARISP, "arisp");
	}

	protected RestClient getRestClient() {
		if (restClient == null) {
			restClient = new RestClient(endpointUri, apiKey);
		}
		return restClient;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getEndpointUri() {
		return endpointUri;
	}

	public void setEndpointUri(String endpointUri) {
		this.endpointUri = endpointUri;
	}

	// region Order

	public <TParameters extends CertificateParameters> Order<TParameters> createOrder(CreateOrderRequest<TParameters> request) throws RestException {
		if (request == null) {
			throw new IllegalArgumentException("The argument \"request\" cannot be null");
		}
		if (request.getParameters() == null) {
			throw new IllegalArgumentException("The property \"parameters\" of the argument \"request\" cannot be null");
		}
		String typedRouteSegment = getTypedApiRoutes(request.getParameters().getFormat());
		OrderModel model = getRestClient().post(String.format("api/orders/%s", typedRouteSegment), request.toModel(), OrderModel.class);
		return new Order<>(model);
	}

	public <TParameters extends CertificateParameters> Order<TParameters> getOrder(String orderId) throws RestException {
		String typeRouteSegment = getTypedApiRoutes(((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
		OrderModel model = getRestClient().get(String.format("api/orders/%s/%s", typeRouteSegment, orderId), OrderModel.class);
		return new Order<>(model);
	}

	public String getOrderIssueLink(String orderId) throws RestException {
		return getOrderIssueLink(orderId, null);
	}

	public String getOrderIssueLink(String orderId, String returnUrl) throws RestException {
		String url = String.format("api/orders/%s/issue-link", orderId);
		if (returnUrl != null && !returnUrl.isEmpty()) {
			try {
				url += String.format("?returnUrl=%s", URLEncoder.encode(returnUrl, "UTF-8"));
			} catch(UnsupportedEncodingException ex) {
				// Do nothing!
			}
		}
		return getRestClient().get(url, String.class);
	}

	public void deleteOrder(String orderId) throws RestException {
		getRestClient().delete(String.format("api/order/%s", orderId));
	}

	// endregion

	// region Certificate

	public Certificate issueCertificate(String orderId, String csr) throws RestException {
		return issueCertificate(orderId, csr, null);
	}

	public Certificate issueCertificate(String orderId, String csr, String keyId) throws RestException {
		IssueCertificateRequest request = new IssueCertificateRequest();
		request.setOrderId(orderId);
		request.setCsr(csr);
		request.setKeyId(keyId);
		CertificateModel model = getRestClient().post("api/v2/certificates", request.toModel(), CertificateModel.class);
		return new Certificate(model);
	}

	public PaginatedSearchResponse<Certificate> listCertificates() throws RestException {
		return listCertificates(null);
	}

	public PaginatedSearchResponse<Certificate> listCertificates(PaginatedSearchParams searchParams) throws RestException {
		return listCertificates(searchParams, false);
	}

	public PaginatedSearchResponse<Certificate> listCertificates(PaginatedSearchParams searchParams, boolean validOnly) throws RestException {
		String uri = setPaginatedSearchParams("api/v2/certificates", searchParams != null ? searchParams : new PaginatedSearchParams()) +
				String.format("&validonly=%s", validOnly);
		PaginatedSearchResponse<CertificateModel> model = this.restClient.get(uri, new TypeReference<PaginatedSearchResponse<CertificateModel>>(){});
		PaginatedSearchResponse<Certificate> response = new PaginatedSearchResponse<>();
		response.setItems(new ArrayList<Certificate>());
		for (CertificateModel m : model.getItems()) {
			response.getItems().add(new Certificate(m));
		}
		response.setTotalCount(model.getTotalCount());
		return response;
	}

	public <TParameters extends CertificateParameters> Certificate<TParameters> getCertificate(String certId) throws RestException {
		return getCertificate(certId, false);
	}

	public <TParameters extends CertificateParameters> Certificate<TParameters> getCertificate(String certId, boolean fillContent) throws RestException {
		String uri = String.format("api/v2/certificates/%s?fillContent=%s", certId, fillContent);
		CertificateModel model = this.restClient.get(uri, new TypeReference<CertificateModel>(){});
		return new Certificate<>(model);
	}

	public void revokeCertificate(String certificateId) throws RestException {
		getRestClient().delete(String.format("api/certificates/%s", certificateId));
	}

	// endregion

	private String setPaginatedSearchParams(String originalUri, PaginatedSearchParams searchParams) {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s?", originalUri));
		if (searchParams.getQ() != null) {
			try {
				sb.append(String.format("q=%s&", URLEncoder.encode(searchParams.getQ(), "UTF-8")));
			} catch(UnsupportedEncodingException ex) {
				// Do nothing.
			}
		}
		if (searchParams.getLimit() != null) {
			sb.append(String.format("limit=%d&", searchParams.getLimit()));
		}
		if (searchParams.getOffset() != null) {
			sb.append(String.format("offset=%d&", searchParams.getOffset()));
		}
		if (searchParams.getOrder() != null) {
			sb.append(String.format("order=%s", searchParams.getOrder()));
		}

		return sb.toString();
	}

	private String getTypedApiRoutes(CertificateFormats certFormat) {
		if (!typeApiRoutes.containsKey(certFormat)) {
			throw new IllegalArgumentException(String.format("Certificate format not supported: %s", certFormat));
		}
		return typeApiRoutes.get(certFormat);
	}

	private String getTypedApiRoutes(Type parametersType) {
		CertificateFormats certFormat;
		if (parametersType.equals(PkiBrazilCertificateParameters.class)) {
			certFormat = CertificateFormats.PKI_BRAZIL;
		} else if (parametersType.equals(SslCertificateParameters.class)) {
			certFormat = CertificateFormats.SSL;
		} else if (parametersType.equals(CnbCertificateParameters.class)) {
			certFormat = CertificateFormats.CNB;
		} else if (parametersType.equals(CnbCACertificateParameters.class)) {
			certFormat = CertificateFormats.CNB_CA;
		} else if (parametersType.equals(CieCertificateParameters.class)) {
			certFormat = CertificateFormats.CIE;
		} else if (parametersType.equals(ArispCertificateParameters.class)) {
			certFormat = CertificateFormats.ARISP;
		} else {
			throw new IllegalArgumentException(String.format("The certificate parameters type not supported: %s", parametersType.toString()));
		}

		return getTypedApiRoutes(certFormat);
	}
}
