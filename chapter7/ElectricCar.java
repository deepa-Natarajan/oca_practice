package chapter7;

public class ElectricCar extends Car{
	public final String drive() {
		return "Driving Electric Car";
		 
	}

	public static void main(String[] args) {
		final Car car = new ElectricCar();
		System.out.print(car.drive());
		

	}

}
class Automobile{
	private final String drive() {
		return "Drving Automobile";
		
	}
}
class Car extends Automobile{
	protected String drive() {
		return "Driving CAr";
	}
}
