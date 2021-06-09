package chapter7;

class Birdy {

	public String getName() {
		return "Unknown";
	}

	public void displayInformation() {
		System.out.println("The bird name is: " + getName());
	}
}

public class Peacock extends Birdy {
	public String getName() {
		return "Peacock";
	}

	public static void main(String[] args) {
		Peacock bird = new Peacock();
		
		Birdy b= bird;
		b.displayInformation();
		

	}

}
