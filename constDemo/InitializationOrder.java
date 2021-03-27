package constDemo;

public class InitializationOrder {
	
		 private String name = "Torchie";//instance variable
		 { System.out.println(name); }
		 
		 private static int COUNT = 0;//static variable and initializer
		 static { System.out.println(COUNT); }
		 { COUNT++; System.out.println(COUNT); }
		 
		 
		 public InitializationOrder() {//constructor
		 System.out.println("constructor");
		 }
		 
		 public static void main(String[] args) {
		 System.out.println("read to construct");
		 new InitializationOrder();
		 }
		

}
