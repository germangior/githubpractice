package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 12;
		boolean flag =true;
		
		for (int i=2;i<number/2;i++) {
			int rem = number%2;
			
			if(rem==0) {
				flag = false;
			break;
				
			}
		}
		if(flag ==true) {
			System.out.println("num is a prime number");
			
		}else {
			System.out.println("num is not a prime number");
		}
			
		
	}
	

}
