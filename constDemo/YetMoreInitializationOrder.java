package constDemo;


	public class YetMoreInitializationOrder {
		
			static { add(2); }//static 1
			static void add(int num)
			{ System.out.print(num + " "); }
	
			
			YetMoreInitializationOrder() //constructor
			{ add(5); }
			
			static { add(4); }//static 2
			{ add(6); } //instance initi1
			
			static //static 3
			{ new YetMoreInitializationOrder(); } //constructor
			{ add(8); } //instance initi 2
	
			public static void main(String[] args) { } 
			}


