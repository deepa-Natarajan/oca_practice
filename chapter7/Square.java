package chapter7;

abstract class Parallelogram{
	private int getEqualSides() {return 0;}
}

abstract class Rectangle extends Parallelogram{
	public  int getEqualSides() {return 2;}
}




public final class Square extends Rectangle{
	public int getEqualSides() {return 4;}
	

	public static void main(String[] args) {
		final Square myFigure = new Square(); // x3
		System.out.print(myFigure.getEqualSides());
	}

}
