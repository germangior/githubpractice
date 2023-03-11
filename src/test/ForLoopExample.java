package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int num=1;num<11;num++) {
			System.out.println(num);
			
		}
		
		for(int num1=10;num1>0;num1--) {
			System.out.println(num1);
		}
		System.out.println("end of loops");
		
		int[] arr1= {2,3,4,6,8,9};
		
		for (int i=1;i<arr1.length;i++) {
			
			System.out.println(arr1[i]);
			
		}
		for(int val:arr1) {
			System.out.println(val);
			
		}
		String str1 = "John is from the US";
		
		
		
		
	}

}
