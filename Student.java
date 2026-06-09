package net.javaguides.StudentMangement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int roll_no;
	private String name;
	private String department;
	private String mobil_no;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
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
	public String getMobil_no() {
		return mobil_no;
	}
	public void setMobil_no(String mobil_no) {
		this.mobil_no = mobil_no;
	}
	
	
	

}
