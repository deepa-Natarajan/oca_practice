package constDemo;

public class Hamster {
	private String color;
	private int weight;
	
	public Hamster(int weight) {
//		this.weight=weight;
//		color="Brown";
		
		this(weight,"brown");//when this is used javacalls another method.
	
	}




	public Hamster(int weight, String color) {
		this.weight=weight;
		this.color=color;
	}
	
	

}
