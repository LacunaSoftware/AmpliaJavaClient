package com.lacunasoftware.amplia;


public class BaseOrder {
	private String id;
	private String caId;
	private String templateId;
	private String alias;
	private String emailAddress;
	private String certificateId;
	private OrderStatus status;


	BaseOrder(BaseOrderModel model) {
		this.id = model.getId();
		this.caId = model.getCAId();
		this.templateId = model.getTemplateId();
		this.alias = model.getAlias();
		this.emailAddress = model.getEmailAddress();
		this.certificateId = model.getCertificateId();

		if (model.getStatus() != null) {
			switch (model.getStatus()) {
				case Pending:
					this.status = OrderStatus.PENDING;
					break;
				case Locket:
					this.status = OrderStatus.LOCKET;
					break;
				case Issued:
					this.status = OrderStatus.ISSUED;
					break;
				default:
					throw new IllegalArgumentException("Invalid value for \"status\" field on BaseOrder constructor.");
			}
		}
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
		this.caId = caId;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}
