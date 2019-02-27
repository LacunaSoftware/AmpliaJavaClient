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

	public <TParameters extends CertificateParameters> Order<TParameters> getOrder(String orderId, Class<TParameters> parametersType) throws RestException {
		String typedRouteSegment = getTypedApiRoutes(parametersType);
		OrderModel model = getRestClient().get(String.format("api/orders/%s/%s", typedRouteSegment, orderId), OrderModel.class);
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
		getRestClient().delete(String.format("api/orders/%s", orderId));
	}

	// endregion

	// region Certificate

	public <TParameters extends CertificateParameters> Certificate<TParameters> issueCertificate(String orderId, String csr) throws RestException {
		return issueCertificate(orderId, csr, null);
	}

	public <TParameters extends CertificateParameters> Certificate<TParameters> issueCertificate(String orderId, String csr, String keyId) throws RestException {
		IssueCertificateRequest request = new IssueCertificateRequest();
		request.setOrderId(orderId);
		request.setCsr(csr);
		request.setKeyId(keyId);
		CertificateModel model = getRestClient().post("api/v2/certificates", request.toModel(), CertificateModel.class);
		return new Certificate<>(model);
	}

	public PaginatedSearchResponse<CertificateSummary> listCertificates() throws RestException {
		return listCertificates(null);
	}

	public PaginatedSearchResponse<CertificateSummary> listCertificates(PaginatedSearchParams searchParams) throws RestException {
		return listCertificates(searchParams, false);
	}

	public PaginatedSearchResponse<CertificateSummary> listCertificates(PaginatedSearchParams searchParams, boolean validOnly) throws RestException {
		String uri = setPaginatedSearchParams("api/v2/certificates", searchParams != null ? searchParams : new PaginatedSearchParams()) +
				String.format("&validonly=%s", validOnly);
		PaginatedSearchResponseModel<CertificateSummaryModel> model = getRestClient().get(uri, new TypeReference<PaginatedSearchResponseModel<CertificateSummaryModel>>(){});
		PaginatedSearchResponse<CertificateSummary> response = new PaginatedSearchResponse<>();
		response.setItems(new ArrayList<CertificateSummary>());
		for (CertificateSummaryModel m : model.getItems()) {
			response.getItems().add(new CertificateSummary(m));
		}
		response.setTotalCount(model.getTotalCount());
		return response;
	}

	public <TParameters extends CertificateParameters> Certificate<TParameters> getCertificate(String certId) throws RestException {
		return getCertificate(certId, false);
	}

	public <TParameters extends CertificateParameters> Certificate<TParameters> getCertificate(String certId, boolean fillContent) throws RestException {
		String uri = String.format("api/v2/certificates/%s?fillContent=%s", certId, String.valueOf(fillContent));
		CertificateModel model = getRestClient().get(uri, new TypeReference<CertificateModel>(){});
		return new Certificate<>(model);
	}

	public void revokeCertificate(String certId) throws RestException {
		getRestClient().delete(String.format("api/certificates/%s", certId));
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
			// Note: Use the value of the PaginationOrder enum.
			sb.append(String.format("order=%s", searchParams.getOrder().getValue()));
		}

		return sb.toString();
	}

	private String getTypedApiRoutes(CertificateFormats certFormat) {
		if (!typeApiRoutes.containsKey(certFormat)) {
			throw new IllegalArgumentException(String.format("Certificate format not supported: %s", certFormat));
		}
		return typeApiRoutes.get(certFormat);
	}

	private <TParameters extends CertificateParameters> String getTypedApiRoutes(Class<TParameters> parametersType) {
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
