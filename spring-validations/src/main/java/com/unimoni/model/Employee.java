package com.unimoni.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.unimoni.custom.validations.Suffix;
import com.unimoni.custom.validations.Suffix2;

/**
 * 
 * @author gopi
 *
 */
public class Employee {

	private int id;

	@Min(value = 18, message = "{min_age}")
	@Max(value = 60, message = "Age should be below 60")
	private int age;
	@Size(min = 6, max = 12, message = "Length should be between 6 and 12")
	private String name;
	@Email
	private String email;
	@Suffix2(value = "UN")
	private String department;

	@Pattern(regexp = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$")
	private String phoneNumber;
	private String deptId;

	public Employee() {

	}

	public Employee(int id, String name, String department, int age, String email) {

		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

}
