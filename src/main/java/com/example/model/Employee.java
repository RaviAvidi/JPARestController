package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "empdata")


public class Employee {

	@Id
	private int empid;
	private String empname;
	private int empsal;
	private String empaddress;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empaddress=" + empaddress
				+ "]";
	}
	public Employee(int empid, String empname, int empsal, String empaddress) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empaddress = empaddress;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
}
