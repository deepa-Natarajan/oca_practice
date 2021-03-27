package constDemo;



	 class InitializerOrder {
					private String name = "Torchie";//instance Variable-second
					{ System.out.println(name); }
						
					private static int COUNT = 0;//Static variable and the static initializer--first
					static { System.out.println(COUNT); }
					static { COUNT += 10; System.out.println(COUNT); }
	
						public InitializerOrder() {//constructors--third
							System.out.println("constructor");
	 } }
	
	
public class callInitializerOrder{
	
	public static void main(String[] args) {
		
		InitializerOrder in=new InitializerOrder();
		
		
	}
	
	
	
}

