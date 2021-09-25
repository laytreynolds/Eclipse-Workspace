package singleresponsibility;

public class Driver extends Car {
	
    public Driver(String colour, String model, int mileage) {
		super(colour, model, mileage);
}

	private int mileage;

    // functionality
    public void drive(int milesDriven){
    	this.setMileage(this.getMileage() + milesDriven);
    }

	@Override
	public String toString() {
		return "Driver [mileage=" + mileage + ", getColour()=" + getColour() + ", getModel()=" + getModel()
				+ ", getMileage()=" + getMileage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}

