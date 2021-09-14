package com.learn.training.user.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class OrderHistoryDTO implements Serializable {
	private static final long serialVersionUID = -929651754268912381L;
	private String userName;
	private double totalAmount;
	private List<OrderHistoryDetailsDTO> orderDetails = new ArrayList<>();

	public OrderHistoryDTO(String userName, double totalAmount, List<OrderHistoryDetailsDTO> orderDetails) {
		super();
		this.userName = userName;
		this.totalAmount = totalAmount;
		this.orderDetails = orderDetails;
	}

	public OrderHistoryDTO() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<OrderHistoryDetailsDTO> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderHistoryDetailsDTO> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
