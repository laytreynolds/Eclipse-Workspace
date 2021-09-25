package flowcharts;

public class FlowChartsEx {

	public static void main(String[] args) {
		System.out.print(flow(10, 23, false));
		flow(100);
		
	
	}
		
	
	
	public static int flow(int num1, int num2, boolean bool) {
		
		int total  = 0;
		
		if (bool == true) {
			
			total = num1 + num2;
	} 
		else if (bool == false) {
		total = num1*num2;
	}
		return total;
	}


	public static void flow(int A) {
	if (A>2000) {
	System.out.println("A");
	if (A>6000) {
	System.out.println("C");
	}
	else {
	System.out.println("B");
	if (A>4000) {
	System.out.println("D");
	}
	else {
	System.out.println("E");
	}
	}
	}
	else {
	System.out.println("1");
	if (A>100) {
	System.out.println("3");
	if (A>600) {
	System.out.println("5");
	}
	else {
	System.out.println("4");
	if (A>500) {
	System.out.println("6");
	}
	else {
	System.out.println("7");
	}
	}
	}
	else {
	System.out.println("2");
	}
	}
	}
}