package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Jake");
		set1.add("Tom");
		set1.add("Bobby");
		set1.add("Laura");
		
		System.out.println(set1);
		TreeSet<String> set2 = new TreeSet<String>();
		
		set2.add("zuri");
		set2.add("Tom");
		set2.add("Bobby");
		set2.add("Laura");
		
		System.out.println(set2);

		
		//convert to list
		
		ArrayList<String> list1 = new ArrayList<String>(set2);
		System.out.println(list1);
		
	}
	
	
		
	

	

	
	
}
