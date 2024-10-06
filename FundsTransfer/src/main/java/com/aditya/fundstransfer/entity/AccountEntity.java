package com.aditya.fundstransfer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_account")
public class AccountEntity {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "acct_no")
	private String accountNo;

	@Column(name = "acct_name")
	private String accountName;

	@Column(name = "acct_type")
	private String accountType;

	@Column(name = "acct_status_code")
	private String accountStatusCode;

	@Column(name = "acct_status_name")
	private String accountStatusName;

	@Column(name = "acct_balance")
	private String accountBalance;

	@Column(name = "acct_ccy_code")
	private String accountCcyCode;

	@Column(name = "acct_ccy_name")
	private String accountCcyName;

	@Column(name = "acct_branch_code")
	private String accountBranchCode;

	@Column(name = "acct_branch_name")
	private String accountBranchName;

	@Column(name = "acct_product_code")
	private String accountProductCode;

	@Column(name = "acct_product_name")
	private String accountProductName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountStatusCode() {
		return accountStatusCode;
	}

	public void setAccountStatusCode(String accountStatusCode) {
		this.accountStatusCode = accountStatusCode;
	}

	public String getAccountStatusName() {
		return accountStatusName;
	}

	public void setAccountStatusName(String accountStatusName) {
		this.accountStatusName = accountStatusName;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountCcyCode() {
		return accountCcyCode;
	}

	public void setAccountCcyCode(String accountCcyCode) {
		this.accountCcyCode = accountCcyCode;
	}

	public String getAccountCcyName() {
		return accountCcyName;
	}

	public void setAccountCcyName(String accountCcyName) {
		this.accountCcyName = accountCcyName;
	}

	public String getAccountBranchCode() {
		return accountBranchCode;
	}

	public void setAccountBranchCode(String accountBranchCode) {
		this.accountBranchCode = accountBranchCode;
	}

	public String getAccountBranchName() {
		return accountBranchName;
	}

	public void setAccountBranchName(String accountBranchName) {
		this.accountBranchName = accountBranchName;
	}

	public String getAccountProductCode() {
		return accountProductCode;
	}

	public void setAccountProductCode(String accountProductCode) {
		this.accountProductCode = accountProductCode;
	}

	public String getAccountProductName() {
		return accountProductName;
	}

	public void setAccountProductName(String accountProductName) {
		this.accountProductName = accountProductName;
	}
	
	

}
