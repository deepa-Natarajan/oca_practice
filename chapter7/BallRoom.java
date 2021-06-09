package chapter7;

abstract class House{
	protected abstract Object getSpace();
}

abstract class Room extends House{
	abstract Object getSpace(Object list);
	//abstract Object getSpace();

}


abstract public class BallRoom extends Room {
	protected abstract Object getSpace();

	public static void main(String[] args) {
		System.out.println("PArty");

	}

}
