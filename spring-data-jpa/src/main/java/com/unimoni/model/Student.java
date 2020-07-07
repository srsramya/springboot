package com.unimoni.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "student")
public class Student {

	@EmbeddedId
	private StudentId studentId;

	@Column
	private String name;

	@Column
	private String course;

	@Column
	private int age;


	public StudentId getStudentId() {
		return studentId;
	}

	public void setStudentId(StudentId studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
