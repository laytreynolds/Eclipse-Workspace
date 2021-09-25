package arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
	
//		create array list
		List<String> collegues = new ArrayList<>();
		
//		add items to array list
		collegues.add("Layt");
		collegues.add("Shaun");
		collegues.add("Stu");
		collegues.add("Andy");
		collegues.add("Sean");
		
		List<Integer> ints = new ArrayList<>();
		
//		print array list
		System.out.println(collegues);
		
		
//		iterate through array list - for loop
		for ( int i = 0; i < collegues.size(); i++) {
			System.out.println(collegues.get(i));
		}
		
//		iterate through array list - Enhanced loop
		for (String i : collegues) {
			System.out.println(i);
		}
	
//		print index from array list get method
		System.out.println(collegues.get(2));
	
//		 set elements - set method
		collegues.set(0, "Neil");
		System.out.println(collegues);
		
//		remove elements - remove method 
		collegues.remove(2);
		System.out.println(collegues);
		
//		print size of list
		System.out.println(collegues.size());	
		
//		clear list
//		collegues.clear();
//		System.out.println(colleagues);
		
//		sort array list
		Collections.sort(collegues);
		System.out.println(collegues);	
		
//		reverse method
		
		Collections.reverse(collegues);
		System.out.println(collegues);
		
//		swap method
		Collections.swap(collegues, 0, 2);
		System.out.println(collegues);
		
		
	}
	
	
	
}
	
