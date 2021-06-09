package chapter7;

class Rotorcraft{
	protected final int height=10;
	int fly() {
		return 0;
	}
}

public class Helicopter extends Rotorcraft{
	private int height = 5;
	protected int fly() {
	return super.height;
	}

	public static void main(String[] args) {
		Helicopter h = new Helicopter();
		System.out.print(h.fly());
	}

}
