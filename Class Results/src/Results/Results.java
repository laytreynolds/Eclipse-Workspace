package Results;

public class Results {
	
	public static int bio;
	public static int phy;
	public static int che;
	public static int totalMark;
	public static int totalPercent;


	public static void main(String[] args) {
		System.out.println(resultsDisplay(120, 111, 90));
		System.out.println(findPercent());
		
 	}
	
	// displays the results that the person got for each exam and then the total mark
	public static String resultsDisplay(int bioMark, int phyMark, int cheMark) {
		
		bio = bioMark;
		phy = phyMark;
		che = cheMark;
		totalMark = bioMark + phyMark + cheMark;
		
		System.out.print("Your Biology mark is: " + bioMark + "." + " Your Physics mark is: " + phyMark + "." + " Your Chemistry mark is: " + cheMark + ".");
		return (" Your total mark is: " + totalMark);
	}
	
	// which finds and displays the percentage that the person received for the exams.
	public static String findPercent() {
		
		totalPercent = (bio + phy + che) * 100 / 450;
		return ("Your total Percent is: " + totalPercent + "%");
		
	}

}
