package GarageExercise;

public class Motorbike extends Vehicle {
	
	private int horsepower;
	
	public Motorbike(String colour, String make, double price, int wheels, int id, int horsepower) {
		super("Motorbike", colour, make, price, wheels, id);
		this.horsepower = horsepower;
		// TODO Auto-generated constructor stub
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public double billCalculate() {
		double vVariable = this.getHorsepower();
		return vVariable / 5;
	}
	

}
