package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"John","Smith","leena","priya"};
		System.out.println("Hello " + names[3]);

		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("John");
		list1.add("Smith");
		list1.add("Leena");
		list1.add("Priya");
		
		System.out.println("The list is " + list1);
		System.out.println("The size of the list is "+list1.size());
		System.out.println("The first name of the list is "+list1.get(0));
		System.out.println("The last name of the list is "+ list1.get(list1.size()-1));
		
		list1.add(1, "mike");
		System.out.println("The list is " + list1);
		list1.remove(1);
		System.out.println("The list is " + list1);
		
		//iterate through list
		
		for(int i=0;i<list1.size();i++) {
			System.out.println("Element name " + list1.get(i));
			
			
		}
		System.out.println("");
		for(String value:list1) {
			System.out.println("element value "+value);
		}
		System.out.println("");
		
		
		
		Collections.sort(list1);
		System.out.println(list1);
		
		
		
		
		
		
		Collections.sort(list1,Collections.reverseOrder());
		
		Iterator<String> itr = list1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		
		
	

}
	
}
