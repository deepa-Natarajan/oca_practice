package chapter7;

public abstract class Bird {

	private void fly() {
		System.out.println("Bird is flying");
	}
	
	
	public static void main(String[] args) {
		Bird bird = new Pelican();
		bird.fly();
		Pelican p=new Pelican();
		p.fly();
		Bird pb=p;
		pb.fly();

	}

}

	
class Pelican extends Bird {
 protected void fly() { 
	 System.out.println("Pelican is flying");
	 }
 }