package chapter7;

public abstract class Reptile1 {

	public  void layEggs() {
		System.out.println("Reptile laying eggs");
	}

	public static void main(String[] args) {
		Reptile1 reptile = new Lizard();
		reptile.layEggs();
	}
	
	
}

class Lizard extends Reptile1 {
public void layEggs() { System.out.println("Lizard laying eggs"); }
 }
