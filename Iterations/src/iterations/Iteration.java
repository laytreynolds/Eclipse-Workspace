package iterations;

public class Iteration {

	public static void main(String[] args) {
//		forLoop();
//		flow1();
//		flow2();
//		flow3();
		flow5();
		
	}
		
		
//		simple for loop
		public static void forLoop() {
		for (int i = 1; i < 10; i++) {
		
		System.out.println(i);
		}
		
	}
//		for loop for repeating letter
		public static void flow1() {
			
			for (int a = 100; a < 200; a++) {
				System.out.println("a");
			}
		}
		
//		for loop for alternating outputs
		public static void flow2() {
			
			for (int a = 100; a <= 200; a++) {
			
				if (a  % 2 == 0) {
				System.out.println("-");
				
				} else {
					System.out.println("*");
				}
			}
		}
		
//			Create a method that can print out the numbers 1-10 10 times each.
			public static void flow3() {
				for (int i=1; i<=10; i++) {
				for (int j=1; j<=10; j++) {
				System.out.println(i);
				}
				}
			}
			
				public static void flow5() {
					for (int i=1; i<=10; i++) {
					int count =0;
					while (count<i) {
					System.out.println(i);
					count++; 
					}
					}

				}			
		
		
}
