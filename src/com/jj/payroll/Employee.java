package com.jj.payroll;
//----------- abstract Employee.java--------------
public abstract class Employee extends Person {

	private String emailID;
	private String telephoneNumber;
	
	public Employee(){
		
	}

	public Employee(int id, String name, String emailID, String telephoneNumber) {
		super(id, name);
		this.emailID = emailID;
		this.telephoneNumber = telephoneNumber;
	}


	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public abstract double paycheck();
	
	@Override
	public String toString() {
		return "Employee [emailID=" + emailID + ", telephoneNumber=" + telephoneNumber + "]";
	}
}
