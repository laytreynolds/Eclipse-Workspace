package arrays;

public class ArrayExercise {
	

	public static void main(String[] args) {
		
		
//		initialise array
		int[] tenInts = new int[10];

//		Populate Array
		tenInts[0] = 1;
		tenInts[1] = 2;
		tenInts[2] = 3;
		tenInts[3] = 4;
		tenInts[4] = 5;
		tenInts[5] = 6;
		tenInts[6] = 7;
		tenInts[7] = 8;
		tenInts[8] = 9;
		tenInts[9] = 10;
		
//		print all values in array
		for (int i : tenInts) {
			System.out.println(i);
		}
		
//		loop to print all values in array
		int[] ints = new int[5];
				
			for (int i = 0; i < ints.length;i++) 
			System.out.println(ints[i] = i);
		
//			print values == to i * 10.
			for (int i = 0; i < ints.length;i++) 
			System.out.println(ints[i] = ints[i]*10);
		
//		initialise string list
		String[] strings = { "Hello", "My", "Friends" };

//		enhance loop through list
			for (String word : strings) {
			System.out.println(word);
		}
		
//		initialise and populate array
		int[] squareInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			for ( int i : squareInts) {
				System.out.println( i * i);
			}
				
//			iterate through array. if odd, square. if even, cube.
			for (int i : squareInts) {
				if (oddEven(i)) {
					System.out.println("Even: " + i * i * i);
				} else { 
					System.out.println("Odd: " + i * i);
				}
			}
			
	}
//			method to check if odd or even
			public static boolean oddEven(int num) {
				if (num % 2 == 0) {
						return true;
				} else { 
						return false;
					}
				
				
			}

		
			
		
		
	
}