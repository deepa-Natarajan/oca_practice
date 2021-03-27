package pond.duck;

public class MotherDuck {
	/*lets talk about default access
	 * any class from the same package can access it
	 * no need to mention the keyword default 
	 */

		String noise="quack";
		void quack() {
			System.out.println(noise);
		}
		void makeNoise() {
			quack();
		}
	
	
	public static void main(String[] args) {
		MotherDuck md=new MotherDuck();
		md.makeNoise();
		
		
		
		

	}

}
