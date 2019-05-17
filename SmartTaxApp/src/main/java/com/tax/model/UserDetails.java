package com.tax.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class UserDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	@Column
	private String userName;
	@Column
	private String fatherName;
	@Column
	private long aadharNumber;
	/*
	 * @Column
	 * 
	 * @Transient
	 * 
	 * @JsonIgnore private MultipartFile formSixteenFile;
	 * 
	 * @Column
	 * 
	 * @JsonIgnore
	 * 
	 * @Transient private MultipartFile taxSavindFile;
	 */
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;

	public UserDetails() {
		super();
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UserDetails(long userId, String userName, String fatherName, long aadharNumber, Address address,
			BankDetails bankDetails) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.fatherName = fatherName;
		this.aadharNumber = aadharNumber;
		this.address = address;
		this.bankDetails = bankDetails;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", fatherName=" + fatherName
				+ ", aadharNumber=" + aadharNumber + ", address=" + address + ", bankDetails=" + bankDetails + "]";
	}

}