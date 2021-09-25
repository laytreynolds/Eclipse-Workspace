package directions;

public enum Directions {

	NORTH("Forward", "N"),
	SOUTH("Backward", "S"),
	EAST("Left", "E"),
	WEST("Right", "W");
	
	private final String motion;
	private final String abrev;

	
	Directions(String motion, String abrev) {
		this.motion = motion;
		this.abrev = abrev;
	}

	public String motion() {
		return motion;
	}
	public String abrev() {
		return abrev;
	}
	
	public String abrevmotion() {
		return (abrev + " is the same as moving " + motion);
	}
	
	
}
