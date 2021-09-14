package com.bankservice.application.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaction_details")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transaction_id")
	private Long transactionId;
	@Column(name = "amount")
	private double amount;
	@Column(name = "from_account")
	private long fromAccount;
	@Column(name = "to_account")
	private long toAccount;
	// @Column(name="transaction_time")
//	@JsonFormat(pattern = "dd.MM.yyyy")
//	private LocalDateTime transactionTime;
//	@Column(name="transaction_type")
//	private String transactionType;
	@Column(name = "remarks")
	private String remarks;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id", referencedColumnName = "account_id")
	private Account account;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(long fromAccount) {
		this.fromAccount = fromAccount;
	}

	public long getToAccount() {
		return toAccount;
	}

	public void setToAccount(long toAccount) {
		this.toAccount = toAccount;
	}

//	public LocalDateTime getTransactionTime() {
//		return transactionTime;
//	}
//
//	public void setTransactionTime(LocalDateTime transactionTime) {
//		this.transactionTime = transactionTime;
//	}

//	public String getTransactionType() {
//		return transactionType;
//	}
//
//	public void setTransactionType(String transactionType) {
//		this.transactionType = transactionType;
//	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Transaction(Long transactionId, double amount, long fromAccount, long toAccount, String remarks,
			Account account) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;

		this.remarks = remarks;
		this.account = account;
	}

	public Transaction() {
		super();
	}

}