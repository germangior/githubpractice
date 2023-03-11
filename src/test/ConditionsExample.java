package test;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 24;
		
		if (age<17)
		{
			
			System.out.println("Your are not elegible to vote");
		}else if (age == 17) {
			System.out.println("next year you will be elgible to vote");
			
		}else {
			System.out.println(" You are elegible to vote");
			
		}
	}

}
