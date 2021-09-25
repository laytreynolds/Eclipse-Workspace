package hashsets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {

//		instantiate hash 
		Set<String> hashSet = new HashSet<>();
		
//		add values to hash set
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("E");
		hashSet.add("D");
		hashSet.add("F");
		hashSet.add("F"); // this will overwrite the previous "F", as duplicate values are not permitted
		System.out.println(hashSet);
		
		
//		check if hash set empty
		hashSet.isEmpty(); // will return true / false
		
		
//		check size of hashSet
		if (hashSet.size() == 0 ){
		    System.out.println("HashSet is empty");
		}
		else {
		    System.out.println(hashSet.size());
		}

	
		hashSet.remove("A");
		
		Iterator<String> setIterator = hashSet.iterator();
		while (setIterator.hasNext()){
		    String obj = setIterator.next();
		    setIterator.remove();
		}
		
//	clear hash set
		hashSet.clear();

//		if hash set contains
		hashSet.contains("A"); // returns boolean
	}

}
