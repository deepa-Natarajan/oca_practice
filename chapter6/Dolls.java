package chapter6;

public class Dolls {
	public int nested() {
	return nested(2, true);
		
	} // g1

	public int nested(int level, boolean height) {
		return nested(level);
	}

	public int nested(int level) {
		return level + 1;
	}; // g2

	public static void main(String[] outOfTheBox) {
		System.out.print(new Dolls().nested());
	}

}
