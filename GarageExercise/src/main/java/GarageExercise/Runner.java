package GarageExercise;

public class Runner {

	public static void main(String[] args) {
		
		Car car = new Car("Black", "Volvo", 35000.00, 4, 1, 5);
		
		Van van = new Van("Red", "Mercedes", 20000.00, 4, 2, 3.00);

		Motorbike moto = new Motorbike("Blue", "Honda", 15000.00, 2, 3, 560);
		
		Garage garage = new Garage();

		garage.addVehicle(moto);
		garage.addVehicle(car);
		garage.addVehicle(van);
		
		garage.printAll();
		
	}

}
