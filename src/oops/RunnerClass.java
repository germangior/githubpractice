package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.Name ="Sweta";
		emp1.EmpId = 1000;
		emp1.DisplayName();
		
		Employee emp2 = new Employee();
		
		emp2.Name = "David";
		emp2.EmpId = 1001;
		emp2.DisplayName();
		
		Employee emp3 = new Employee("Rohan",1002);
		emp3.DisplayName();
		
		emp3.DisplaySalary();
		Citizen citi1 = new Citizen();
		citi1.age = 50;
		citi1.Name = "Mike";
		citi1.SSN = 12345;
		citi1.Print();
		
		Citizen citi2 = new Citizen("Rahul", "india", 30, 6789);
		citi2.Print();
		
		
		Insurance obj1 = new Insurance();
		obj1.InsuranceId = 3000;
		obj1.SSN = 1111;
		obj1.Print();
		obj1.Print("hello class");
		
	
	
		
		
		
		
		
		

	}

}
