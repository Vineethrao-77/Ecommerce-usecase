package com.bankservice.application.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)


public class FundTransferDto 
{
	 private String fromAccountNo;
	 private String toAccountNo;
     private String transferAmount;
	 private String remarks;
	public String getFromAccountNo() {
		return fromAccountNo;
	}
	public void setFromAccountNo(String fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}
	public String getToAccountNo() {
		return toAccountNo;
	}
	public void setToAccountNo(String toAccountNo) {
		this.toAccountNo = toAccountNo;
	}
	public String getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(String transferAmount) {
		this.transferAmount = transferAmount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public FundTransferDto(String fromAccountNo, String toAccountNo, String transferAmount, String remarks) {
		super();
		this.fromAccountNo = fromAccountNo;
		this.toAccountNo = toAccountNo;
		this.transferAmount = transferAmount;
		this.remarks = remarks;
	}
	public FundTransferDto() {
		super();
	}
	 
	 
}
