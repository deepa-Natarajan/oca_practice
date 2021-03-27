
public class PassingData {

	public static void main(String[] args) {
		
		//passing primitivedata
		
		int num=3;
		passingData(num);
		System.out.println(num +"  Inside main");
		
		
		//passing reference type
		
		String name="deepa";
		PassingRef(name);
		System.out.println("Inside main:" + name);
		
		//methods can act on reference type
		
		methodAct(name);
		System.out.println("Inside main:" + name);
		
		//String Builder methods can have an impact on the changes that were made in the methods.
		
		StringBuilder sb= new StringBuilder("Sarath");
		speak(sb);
		
		System.out.println(sb);
		
		Integer numI=90;
		changeObj(numI);
		System.out.println(numI);
		
		
		
		
		

	}

	private static void changeObj(Integer numI) {
		
		System.out.println(numI.sum(numI, 100));
	}

	private static void speak(StringBuilder sb) {
		sb.append("Subhash");
		//means that changes made to the StringBuilder are available to both references.
		
	}

	private static void methodAct(String name) {
		
		System.out.println(name.concat("Subhash"));
		
	}

	private static void PassingRef(String name) {
		name="Natarajan";
		System.out.println("outside main:" + name);
		
	}

	private static void passingData(int num) {
		num=5;
		System.out.println(num + " Outside main");
		
		
	}

}
