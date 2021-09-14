package com.learn.training.user.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = Include.NON_EMPTY)

public class OrderProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userId;
	private String userName;
	private String accountNo;
	private List<ProductDTO> productDto = new ArrayList<>();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public List<ProductDTO> getProductDto() {
		return productDto;
	}

	public void setProductDto(List<ProductDTO> productDto) {
		this.productDto = productDto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public OrderProductDTO(String userId, String userName, String accountNo, List<ProductDTO> productDto) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.accountNo = accountNo;
		this.productDto = productDto;
	}

	public OrderProductDTO() {
		super();
	}

}
