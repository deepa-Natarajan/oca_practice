package chapter6;

public class Phone {
	
	private int size;
	public Phone(int size) {this.size=size;}
	public static void sendHome(Phone p, int newSize) {
	p = new Phone(newSize);
	p.size = 4;
	}

	public static void main(String[] args) {
		final Phone phone = new Phone(3);
		sendHome(phone,7);
		System.out.print(phone.size);
	}

}
