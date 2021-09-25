package abstraction_interface;

public class Car implements Vehicle, Driving {

	@Override
	public void drive() {
		System.out.println("BroomBroom");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void honk() {
		System.out.println("HONK");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beltOn() {
		System.out.println("Putting on seatbelt");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startCar() {
		System.out.println("Putting key in engine");
		// TODO Auto-generated method stub
		
	}

}
