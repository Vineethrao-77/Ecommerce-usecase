package com.bankservice.application.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_id")
	private Long accountId;

	@Column(name = "account_no")
	private Long accountNo;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "available_balance")
	private double availableBalance;

	@Column(name = "bank_name")
	private String bankName;

	@Column(name = "branch_name")
	private String branchName;

	@Column(name="ifs_code")
	private String ifsCode;
	
	@Column(name = "customer_id")
	private String customerId;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Transaction> transactionDetails;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
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

//	public LocalDateTime getCreationDate() {
//		return creationDate;
//	}
//
//	public void setCreationDate(LocalDateTime creationDate) {
//		this.creationDate = creationDate;
//	}

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

	public List<Transaction> getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(List<Transaction> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public Account(Long accountId, Long accountNo, String accountType, double availableBalance, String bankName,
			String branchName, String ifsCode, String customerId,
			List<Transaction> transactionDetails) {
		super();
		this.accountId = accountId;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.availableBalance = availableBalance;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifsCode = ifsCode;
		this.customerId = customerId;
		this.transactionDetails = transactionDetails;
	}

	public Account() {
		super();
	}
	
	

}