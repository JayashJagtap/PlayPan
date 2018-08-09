package com.jj.payroll;
//-------------- PayrollApp.java ------------
public class PayrollApp {

	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		
		Management employee1 = new Management(1, "John", "john@payrollapp.com", "1234-56789");
		employee1.setSalary(20000);
		employee1.setBonus(5000);
		
		Sales employee2 = new Sales(2, "Kevin", "kevin@payrollapp.com", "4321-98765");
		employee2.setBasePay(10000);
		employee2.setSales(35000);
		
		Hourly employee3 = new Hourly(3, "Tom", "tom@payrollapp.com", "9876-54321");
		employee3.setHours(40);
		employee3.setWage(10);
		employee3.setRate(50);
		
		payroll.addEmployee(employee1);
		payroll.addEmployee(employee2);
		payroll.addEmployee(employee3);
		
		System.out.println("\n---------Payroll Application--------\n");
		System.out.println(payroll.toString());
		System.out.println("Total Payroll:"+payroll.totalPayroll());
		payroll.removeEmployee(employee2);
		System.out.println("\n---------After removing employee Kevin--------\n");
		System.out.println(payroll.toString());
		System.out.println("Total Payroll:"+payroll.totalPayroll());
	}
}
