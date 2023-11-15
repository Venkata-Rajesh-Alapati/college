package com.example.college.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	@Id
	private int sid;
	private String sname;
	private double gpa;
	private int hs;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getHs() {
		return hs;
	}
	public void setHs(int hs) {
		this.hs = hs;
	}
	
	
}
