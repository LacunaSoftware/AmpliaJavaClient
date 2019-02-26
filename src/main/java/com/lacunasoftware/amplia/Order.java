package com.lacunasoftware.amplia;


public class Order<TParameters extends CertificateParameters> extends BaseOrder {
	private TParameters parameters;

	@SuppressWarnings("unchecked")
	Order(OrderModel model) {
		super(model);
		if (model.getParameters() != null) {
			try {
				this.parameters = (TParameters) CertificateParameters.decode(model.getParameters());
			} catch (ClassCastException ex) {
				throw new ClassCastException(String.format("Certificate parameters of type %s cannot be to casted.", parameters.getFormat()));
			}
		}

	}

	public TParameters getParameters() {
		return parameters;
	}

	public void setParameters(TParameters parameters) {
		this.parameters = parameters;
	}
}
