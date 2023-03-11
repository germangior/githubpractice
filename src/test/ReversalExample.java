package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ahoha";
		String result = "";
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
			
		}

		for(int i=str1.length()-1;i>=0;i--) {
			System.out.println(str1.charAt(i));
			result = result + str1.charAt(i);
		}	
		System.out.println("Reversed string is -->" + result);
	
	if(str1.equals(result)) {
		
		System.out.println("the given is a palindrome");
		
	}else { 
		System.out.println("its not");
	}
		
	//========================================
	
	String str2 ="David meets john and lily";
	String[] arr = str2.split(" ");
	String result1="";
	
	for(int i=arr.length-1;i>0;i--) {
		result1 = result1+arr[i]+" ";
		
	}
	System.out.println(result1);
	
	
	
	
	
		
	}
	
	

}
