package chapter6;

public class Bond {
	private static int price = 5;
	protected int cost=100;

	public boolean sell() {

		if (price < 10) {
			price++;
			return true;
		} else if (price >= 10) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		new Bond().sell();
		new Bond().sell();
		new Bond().sell();
		System.out.print(price);
	}

}
