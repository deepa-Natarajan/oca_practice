package chapter7;

interface Sphere {
	default String getName() {
		return "unknown";
	}
}

abstract class Planet {
	abstract String getName();
}

public class Mars extends Planet implements Sphere {
	public Mars() {super();}
	
	Mars mars=new Mars();
	Planet p=mars;
		

	public static void main(final String[] args) {
		System.out.println(new Mars().getName());

	}

	public String getName() {

		return "Mars";
	}

}
