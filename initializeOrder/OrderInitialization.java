package initializeOrder;

public class OrderInitialization {
	private String name = "Torchie";
	{
		System.out.println(name);
	}

	private static int COUNT = 0;
	
	static {
		System.out.println(COUNT);
	}
	static {
		COUNT += 10;
		System.out.println(COUNT);
	}
	
	 public OrderInitialization() { System.out.println("constructor");
	 
	 }
	

	public static void main(String[] args) {

		OrderInitialization oi = new OrderInitialization();

	}

}
