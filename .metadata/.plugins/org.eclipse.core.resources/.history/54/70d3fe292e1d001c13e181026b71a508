package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressions {

	public static void main(String[] args) {
		
//		For each list
		ArrayList<Integer> myList = new ArrayList<>();
	    myList.add(1);
	    myList.add(2);
	    myList.add(3);
	    myList.add(4);

	    myList.forEach(x -> System.out.println(x));
	    
	    
	
//		For each list -  with conditionals - prints evens
	    List<Integer> myOddInts = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	    
	    myOddInts.forEach(n -> {if (n % 2 != 0) System.out.println(n);});
	    
	    
	    
//		For each list -  with conditionals - prints evens
	    List<Integer> myEvenInts = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	    
	    myEvenInts.forEach(n -> {if (n % 2 == 0) System.out.println(n);});
	    
	    
	    
//		STREAMS  
		Stream<String> myStream = Stream.of("Cat", "Dog", "Cow");
		
		myStream.filter( x -> x.contains("C")).forEach(x -> System.out.println(x));
		
	
//		Maps - manipulate stream
		myStream.map(x -> x.toUpperCase()).forEach(x -> System.out.println(x));
		
		
//		Convert original stream to list
		List<String> myStringList = myStream.map(x -> x.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(myStringList);
	
		
		
		
	}

	
	
}
