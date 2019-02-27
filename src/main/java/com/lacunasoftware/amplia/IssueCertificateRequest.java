package com.lacunasoftware.amplia;


public class IssueCertificateRequest {
	private String orderId;
	private String csr;
	public String keyId;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCsr() {
		return csr;
	}

	public void setCsr(String csr) {
		this.csr = csr;
	}

	public String getKeyId() {
		return keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	IssueCertificateRequestModel toModel() {
		IssueCertificateRequestModel model = new IssueCertificateRequestModel();
		model.setOrderId(orderId);
		model.setCsr(csr);
		model.setKeyId(keyId);
		return model;
	}
}
