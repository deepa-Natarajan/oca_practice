package pond.duck;

public class BadDuckling {

	public static void main(String[] args) {
		FatherDuck fd=new FatherDuck();
		//fd.noise;--> calling a private variable or method doesnt work
		MotherDuck md=new MotherDuck();
		md.makeNoise();

	}

}
