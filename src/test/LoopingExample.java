package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		while(num<11) {
			
			if (num==5) {
				System.out.println("Found");
				num++;
				break;
			}
			System.out.println(num);
			num++;
			
		}
		System.out.println("end of loop");
		
		int num1 =10;
		while(num1>0) {
			System.out.println(num1);
			num1--;
		
		}
		System.out.println("end of second loop");
		
	}

}
