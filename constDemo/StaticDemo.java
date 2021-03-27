package constDemo;

public class StaticDemo {
	
	private  int num;
	
	
	private StaticDemo(int num) {
		this.num=num;
		//System.out.println(this.num);
	}
		public static void main(String[] args) {
			StaticDemo sd=new StaticDemo(5);
			
			System.out.println("Inside main:" + sd.num );
	
		

	}

}
