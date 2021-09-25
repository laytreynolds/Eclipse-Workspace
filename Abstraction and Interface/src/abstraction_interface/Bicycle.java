package abstraction_interface;

public class Bicycle implements Vehicle, Riding {

	@Override
	public void drive() {
		System.out.println("PeddalPeddal");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void honk() {
		System.out.println("BoingBoing");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void helmetOn() {
		System.out.println("Putting on helmet");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pedal() {
		System.out.println("Peddling!");
		// TODO Auto-generated method stub
		
	}

}
