package lambdaexercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Questions {

	public static void main(String[] args) {
		
//		instantiate list
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		
//		brute force filter
	    List<String> result = names.stream().filter(str -> str.startsWith("M")).collect(Collectors.toList());
	    List<String> result1 = names.stream().filter(str -> str.startsWith("D")).collect(Collectors.toList());
	    List<String> result2 = names.stream().filter(str -> str.startsWith("J")).collect(Collectors.toList());
	    List<String> result3 = names.stream().filter(str -> str.startsWith("C")).collect(Collectors.toList());
		
	    
	    result.forEach(x -> System.out.println("Hello " + x));
	    result1.forEach(x -> System.out.println("Hello " + x));
	    result2.forEach(x -> System.out.println(x));
	    result3.forEach(x -> System.out.println("Hello " + x));
	    
//	    if statement filter
	    names.forEach(x -> {if (x.startsWith("C") || x.startsWith("M") || x.startsWith("D")) System.out.println("Hello " + x);
	    	if (x.startsWith("J")) System.out.println(x);}); 
	    
//	    stream filter
	    names.stream()

	     .filter(name -> !name.contains("James")).forEach(name ->System.out.println("Hello " + name));
	    
	    
	    
//	    Reduce list to products
	    List<Integer> number = Arrays.asList(2, 4, 7, 8, 12);
	    
	    double product = number.stream().reduce((a, b) -> a*b).get();
	    
	    System.out.println(product);
	  
	    
	    
//	    create list of ints
	    
	    List<Integer> ints = Arrays.asList(2, 4, 7, 8, 12, 4, 5, 19);
	    
//	    max value
	    
	    OptionalInt maxValue = ints.stream().mapToInt(Integer::intValue).max();
	    
	    System.out.println(maxValue);

	    
//	    min value
	    
	    OptionalInt minValue = ints.stream().mapToInt(Integer::intValue).min();
	    
	    System.out.println(minValue);

	    
//	    remove odd 
	    
	    List<Integer> removeOdd = ints.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
	    
	    System.out.println(removeOdd);
	    
//	    remove even
	    
 List<Integer> removeEven = ints.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
	    
	    System.out.println(removeEven);
	   
	    
//	    find sum 
	    
  double sum = ints.stream().reduce((a, b) -> a+b).get();
	    
	    System.out.println(sum);
	    
	    
//	    square numbers and remove even and find min value
	    
	    
		System.out.println(ints.stream().map(x -> x * x).filter(x -> x % 2 != 0).min((a, b) -> Integer.compare(a, b)).get());

	    
	    
	    

	}	    
	  	

}
