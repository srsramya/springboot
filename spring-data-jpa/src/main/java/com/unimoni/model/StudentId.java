package com.unimoni.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StudentId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String email;

	private String phoneNumber;

	public StudentId() {

	}

	public StudentId(String email, String phoneNumber) {
		super();
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
