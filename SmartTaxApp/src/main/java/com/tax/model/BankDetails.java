package com.tax.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BankDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bankId;
	@Column
	private long bankAccNum;
	@Column
	private String bankAccName;
	@Column
	private String ifsc;
	@Column
	private String websitePassword;

	public BankDetails() {
		super();
	}

	public BankDetails(long bankId, long bankAccNum, String bankAccName, String ifsc, String websitePassword) {
		super();
		this.bankId = bankId;
		this.bankAccNum = bankAccNum;
		this.bankAccName = bankAccName;
		this.ifsc = ifsc;
		this.websitePassword = websitePassword;
	}

	public long getBankId() {
		return bankId;
	}

	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

	public long getBankAccNum() {
		return bankAccNum;
	}

	public void setBankAccNum(long bankAccNum) {
		this.bankAccNum = bankAccNum;
	}

	public String getBankAccName() {
		return bankAccName;
	}

	public void setBankAccName(String bankAccName) {
		this.bankAccName = bankAccName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getWebsitePassword() {
		return websitePassword;
	}

	public void setWebsitePassword(String websitePassword) {
		this.websitePassword = websitePassword;
	}

	@Override
	public String toString() {
		return "BankDetails [bankId=" + bankId + ", bankAccNum=" + bankAccNum + ", bankAccName=" + bankAccName
				+ ", ifsc=" + ifsc + ", websitePassword=" + websitePassword + "]";
	}

}
