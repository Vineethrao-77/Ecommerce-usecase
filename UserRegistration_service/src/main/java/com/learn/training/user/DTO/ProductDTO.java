package com.learn.training.user.DTO;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ProductDTO implements Serializable {
	private String productId;
	private String quantity;
	private double totalPrice;

	public ProductDTO(String productId, String quantity, double totalPrice) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public ProductDTO() {
		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
