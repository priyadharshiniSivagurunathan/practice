package org.hi;

public class Employee extends CompanyInfo {

	private void salary(double salary) {
		System.out.println("The total salary is based on your HR+Revenue+sales :" + salary);
	}

	@Override
	public void hr(float hrSalary) {
		System.out.println("The HR pay is :" + hrSalary);
	}

	@Override
	public void sales(float sales) {
		System.out.println("The sales is :" + sales);
	}

	@Override
	public void revenue(float revenue) {
		System.out.println("The Total revenue is :" + revenue);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.hr(10000f);
		e.revenue(10000f);
		e.sales(20000f);
		e.salary(40000);
	}
}
