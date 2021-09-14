package com.bankservice.application.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)

public class AccountDTO implements Serializable 
{
	private static final long serialVersionUID = -6581673296616581003L;
	
	private String accountType;
	
	private String openingDeposit;

	private String bankName;

	private String branchName;
	
	private String ifsCode;
	
	private String customerId;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getOpeningDeposit() {
		return openingDeposit;
	}

	public void setOpeningDeposit(String openingDeposit) {
		this.openingDeposit = openingDeposit;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfsCode() {
		return ifsCode;
	}

	public void setIfsCode(String ifsCode) {
		this.ifsCode = ifsCode;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AccountDTO(String accountType, String openingDeposit, String bankName, String branchName, String ifsCode,
			String customerId) {
		super();
		this.accountType = accountType;
		this.openingDeposit = openingDeposit;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifsCode = ifsCode;
		this.customerId = customerId;
	}

	public AccountDTO() {
		super();
	}
	
	

}
