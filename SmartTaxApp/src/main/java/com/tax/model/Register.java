package com.tax.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String confPassword;
	@Column
	private long mobileNum;

	public Register() {
		super();
	}

	public Register(long id, String email, String password, String confPassword, long mobileNum) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.confPassword = confPassword;
		this.mobileNum = mobileNum;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfPassword() {
		return confPassword;
	}

	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", email=" + email + ", password=" + password + ", confPassword=" + confPassword
				+ ", mobileNum=" + mobileNum + "]";
	}

}