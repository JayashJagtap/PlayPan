package com.jj.payroll;
// ------------- Hourly.java------------
public class Hourly extends Employee {

	private double hours;
	private double wage;
	private double rate;
	
	public Hourly() {
	}	
	public Hourly(int id, String name, String emailID, String telephoneNumber) {
		super(id, name, emailID, telephoneNumber);
	}
	public Hourly(int id, String name, String emailID, String telephoneNumber, double hours, double wage, double rate) {
		super(id, name, emailID, telephoneNumber);
		this.hours = hours;
		this.wage = wage;
		this.rate = rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Hourly [hours=" + hours + ", wage=" + wage + ", rate=" + rate + "]";
	}

	@Override
	public double paycheck() {
		// you can modify hourly calculation as per your requirement
		if(this.hours > 40) {
			this.wage += (this.hours * this.rate) / 2;
		}
		return this.hours * this.rate + this.wage;
	}
}
