package com.emp.BO;
//import java.util.*;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String doj;
	
	
	public Employee(int id, String name, int salary, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", doj=" + doj + "]";
	}
	
}
