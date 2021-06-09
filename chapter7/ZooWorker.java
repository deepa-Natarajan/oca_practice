package chapter7;

public class ZooWorker extends Reptile  {
		

	public static void feed(Reptile r) {
		System.out.println(r.getName());
	}

	public static void main(String[] args) {
		feed(new Reptile());
		feed(new Alligator());
		feed(new Crocodile());

	}

	
}

class Reptile {
	public String getName() {
		return "Reptile";			
	}
		

}
class Crocodile extends Reptile{
	
	public String getName() {
		return "Crocodile";			
	}

}
class Alligator extends Reptile{
	
	public String getName() {
		return "Alligator";			
	}
	
}
