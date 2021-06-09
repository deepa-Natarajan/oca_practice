package chapter7;

public class Platypus extends Mammal{
	public Platypus() {
		super(1);		
		System.out.println("Platypus");
		
	}

	public static void main(String[] args) {

		new Mammal(5);
	}

}

class Mammal{
	public Mammal(int age) {
		System.out.println("Mammal");
	}
}
