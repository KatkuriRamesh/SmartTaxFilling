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
public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressid;
	@Column
	private String hno;
	@Column
	private String villageName;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private long pinCode;
	@Column
	private String houseName;

	public Address() {
		super();
	}

	public Address(long addressid, String hno, String villageName, String city, String state, long pinCode,
			String houseName) {
		super();
		this.addressid = addressid;
		this.hno = hno;
		this.villageName = villageName;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.houseName = houseName;
	}

	public long getAddressid() {
		return addressid;
	}

	public void setAddressid(long addressid) {
		this.addressid = addressid;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", hno=" + hno + ", villageName=" + villageName + ", city=" + city
				+ ", state=" + state + ", pinCode=" + pinCode + ", houseName=" + houseName + "]";
	}

}
