package initializeOrder;

public class YetMore {
	static { add(2); }//first
	
	static void add(int num) 
	{ System.out.print(num + " "); }
	
	YetMore() { add(5); }//5th
	
	static { add(4); }//second
	{ add(6); }//3rd
	
	static { new YetMore(); }
	 { add(8); }//4th

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
