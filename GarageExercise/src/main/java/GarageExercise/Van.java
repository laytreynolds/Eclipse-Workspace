package GarageExercise;

public class Van extends Vehicle {
	
	private double length;

	public Van(String colour, String make, double price, int wheels, int id, double length) {
		super("Van", colour, make, price, wheels, id);
		this.setLength(length);
		// TODO Auto-generated constructor stub
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double billCalculate() {
		double vVariable = this.getLength();
		return vVariable * 5;
	}
	
	
}
