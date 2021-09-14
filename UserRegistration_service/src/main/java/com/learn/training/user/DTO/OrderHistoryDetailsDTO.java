package com.learn.training.user.DTO;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class OrderHistoryDetailsDTO implements Serializable {
	private static final long serialVersionUID = -9187738826525221591L;

	private String productName;
	private double price;
	private int quantity;
	private double totalPrice;
	private String orderDate;

	public OrderHistoryDetailsDTO(String productName, double price, int quantity, double totalPrice, String orderDate) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
	}

	public OrderHistoryDetailsDTO() {
		super();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
