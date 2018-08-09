package com.jj.payroll;
//-------------- Management.java ------------
public class Management extends Employee {
	private double salary;
	private double bonus;
	public Management(){	
	}
	public Management(int id, String name, String emailID, String telephoneNumber) {
		super(id, name, emailID, telephoneNumber);
	}
	public Management(int id, String name, String emailID, String telephoneNumber, double salary, double bonus){
		super(id, name, emailID, telephoneNumber);	
		this.salary = salary;
		this.bonus = bonus;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public double paycheck() {
		return salary + bonus;
	}
	@Override
	public String toString() {
		return "Management [salary=" + salary + ", bonus=" + bonus + "]";
	}
}
