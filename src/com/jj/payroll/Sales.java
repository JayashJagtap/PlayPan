package com.jj.payroll;
//------------- Sales.java -------------------
public class Sales extends Employee {
	private double sales;
	private double basePay;	
	public Sales(){	
	}
	public Sales(int id, String name, String emailID, String telephoneNumber) {
		super(id, name, emailID, telephoneNumber);
	}
	public Sales(int id, String name, String emailID, String telephoneNumber, double sales, double basePay) {
		super(id, name, emailID, telephoneNumber);
		this.sales = sales;
		this.basePay = basePay;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public double getBasePay() {
		return basePay;
	}
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}	
	@Override
	public String toString() {
		return "Sales [sales=" + sales + ", basePay=" + basePay + "]";
	}
	@Override
	public double paycheck() {
		return basePay + getCommission();
	}
	
	private double getCommission() {
		//sales under $30,000 --- commission rate 1% 
		//sales between $30,000 and $50,000 --- commission rate 1.5% 
		//sales over $50,000 --- commission rate 4% 
		double commissionRate = 0; 
		if(this.sales < 30000) {
			commissionRate = 1;
		} else if (this.sales >= 30000 && this.sales <= 50000) {
			commissionRate = 1.5;
		} else if (this.sales > 50000) {
			commissionRate = 4;
		}	
		return this.sales * commissionRate;
	}
}
