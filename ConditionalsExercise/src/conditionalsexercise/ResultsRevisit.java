package conditionalsexercise;

public class ResultsRevisit {

	public static int bio;
	public static int phy;
	public static int che;
	public static int totalMark;
	public static int totalPercent;
	


	public static void main(String[] args) {
		System.out.println(resultsDisplay(100, 100, 89));
		findPercent();
		
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
	public static void findPercent() {
		
		totalPercent = (bio + phy + che) * 100 / 450;
		int bioPercent = (bio * 100) / 150;
		int phyPercent = (phy  * 100) / 150;
		int chePercent = (che  * 100) / 150;
		
		System.out.println("Your total Percent is: " + totalPercent + "%");
		
		
		if (totalPercent > 60 && bioPercent >= 60 && phyPercent >= 60 && chePercent >= 60) {
			System.out.println("You have passed all exams!");
		} else if (totalPercent > 60 && bioPercent < 60) { 
			System.out.println("You have failed - Biology Mark was below 60%");
		} else if (totalPercent > 60 && phyPercent < 60) { 
			System.out.println("You have failed - Physics Mark was below 60%");
		} else if (totalPercent > 60 && chePercent < 60) { 
			System.out.println("You have failed - Chemistry Mark was below 60%");
		} else if (totalPercent < 60) {
			System.out.println("You have failed");
		}
	}
}
