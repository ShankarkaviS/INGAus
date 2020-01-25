package com.hcl.introduction.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="student")
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long sId;
	private String sName;
	private String sPlace;
	private String sDepartment;
	private double sAge;
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsPlace() {
		return sPlace;
	}
	public void setsPlace(String sPlace) {
		this.sPlace = sPlace;
	}
	public String getsDepartment() {
		return sDepartment;
	}
	public void setsDepartment(String sDepartment) {
		this.sDepartment = sDepartment;
	}
	public double getsAge() {
		return sAge;
	}
	public void setsAge(double sAge) {
		this.sAge = sAge;
	}
}
