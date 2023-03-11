package oops;

public class Employee {

	public String Name;
	public int EmpId;
	private static int Salary = 50000;
	
	public Employee() {
		System.out.println("default cons");
	}
	
	public Employee(String var1, int var2) {
		Name = var1;
		EmpId =var2;
		
	}
	
	public void DisplayName() {
	
			System.out.println("Name of the Employee is " + Name);
	}

	public void DisplaySalary() {
		
		System.out.println("Name of the Employee is " + Salary);
}

	
	
}

	
	
		
	

	


