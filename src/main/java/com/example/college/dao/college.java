package com.example.college.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class college {

	@Id
	private String cname;
	private String state;
	private int enr;
	public String getcName() {
		return cname;
	}
	public void setcName(String cName) {
		this.cname = cName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getEnr() {
		return enr;
	}
	public void setEnr(int enr) {
		this.enr = enr;
	}
	
	
}
