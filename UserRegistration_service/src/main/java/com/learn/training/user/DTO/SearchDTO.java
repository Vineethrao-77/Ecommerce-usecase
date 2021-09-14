package com.learn.training.user.DTO;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class SearchDTO implements Serializable
{

	private static final long serialVersionUID = 1L;
	private String categoryName;
	private String categoryDescrption;
	private long productId;
	private String productName;
	private double productPrice;
	private int productQuantity;
	private String productDescription;
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescrption() {
		return categoryDescrption;
	}
	public void setCategoryDescrption(String categoryDescrption) {
		this.categoryDescrption = categoryDescrption;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public SearchDTO() {
		super();
	}
	

	
}
