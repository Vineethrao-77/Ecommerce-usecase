package com.bankservice.application.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)

public class AccountResponse
{
  private double availableBalance;
  private long accountNo;
public double getAvailableBalance() {
	return availableBalance;
}
public void setAvailableBalance(double availableBalance) {
	this.availableBalance = availableBalance;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public AccountResponse(double availableBalance, long accountNo) {
	super();
	this.availableBalance = availableBalance;
	this.accountNo = accountNo;
}
public AccountResponse() {
	super();
}
  
  
}
