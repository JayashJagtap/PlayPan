package com.jj.payroll;
//----------Payroll.java---------------------
import java.util.ArrayList;
import java.util.List;

public class Payroll {

	private List<Employee> employees;
	
	public Payroll() {
		
	}
	
	public void addEmployee(Employee employee) {
		if(employees == null) {
			employees = new ArrayList<>();
		}
		this.employees.add(employee);
	}
	
	public List<Employee> getEmployees() {
		return this.employees;
	}

	public Employee getEmployee(int id) {
		for(Employee employee : employees) {
			if(employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}
	public void removeEmployee(Employee employee) {
		if(employees != null && employees.size() > 0) {
			this.employees.remove(employee);
		}
	}
	
	public double totalPayroll() {
		//calculate total payroll
		double totalPay = 0;
		
		for(Employee employee : employees) {
			totalPay += employee.paycheck();
		}
		return totalPay;
	}
	
	@Override
	public String toString() {
		//Display Payroll employees in proper format 
		StringBuilder sb = new StringBuilder();
		for(Employee employee : employees) {
			sb.append(employee.getName()).append(":").append(employee.toString()).append("\n");
		}
		return sb.toString();
	}
	
}
