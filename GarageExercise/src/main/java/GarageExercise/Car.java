package GarageExercise;

public class Car extends Vehicle {
	
	private int seats;
	
	public Car(String colour, String make, double price, int wheels, int id, int seats) {
		super("Car", colour, make, price, wheels, id);
		this.seats = seats;
		// TODO Auto-generated constructor stub
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = åseats;
	}
	
	@Override
	public double billCalculate() {
		double vVariable = this.getSeats();
		return vVariable * 10;
	}

	
	

}
