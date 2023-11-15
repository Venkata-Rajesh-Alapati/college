package com.example.college.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class apply {
	
	@Id
	private int aid;
	
	@ManyToOne
	@JoinColumn(name = "sid")
	private student student;
	
	@ManyToOne
	@JoinColumn(name = "cname")
	private college college;
	
	private String major;
	private String decision;

	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public student getStudent() {
		return student;
	}
	public void setStudent(student student) {
		this.student = student;
	}
	public college getCollege() {
		return college;
	}
	public void setCollege(college college) {
		this.college = college;
	}
	
}
