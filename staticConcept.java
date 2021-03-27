
public class staticConcept {

	private String name="staticDemo";
	public static void one() {
		System.out.println("Inside one");
	};
	public static void two() {
		System.out.println("Inside Two");
	};
	public  void three() {
		System.out.println(name);
	}
	
		
	
	
	public static void main(String[] args) {
		staticConcept sc = new staticConcept();
		
	one();two();
	sc.three();
	new staticConcept().three();
	

	}

}
