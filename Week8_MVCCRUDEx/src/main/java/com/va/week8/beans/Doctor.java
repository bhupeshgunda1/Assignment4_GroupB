package com.va.week8.beans;

/**
 * @author VivekAhuja_Work
 * this is a bean class for doctor entity...
 *  */

public class Doctor {
	
	private int doctor_id;  
	private String doctor_name;  
	private String experience;  
	private double salary;
	
	public int getDoctor_id() {
		return doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public String getExperience() {
		return experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}  

}
