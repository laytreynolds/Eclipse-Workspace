package planet;

public class Runner {

    public static void main(String[] args) {
    	
        double earthWeight = Double.parseDouble("175");
        
        double mass = earthWeight/Planet.JUPITER.surfaceGravity();
        
        for (Planet planet : Planet.values()) {
        	System.out.println("Your mass on " + planet + " is " + mass);
        }
    }
}