
public class ForDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		
	int x=0;
		//long y=5;
		for(long y=0,z=4; x<5 && y<10 ;x++,y++) {
			
			System.out.print(y + " ");			
		}		
		System.out.println("X" + x) ;		
	
	////////////////////////
	
	int[] values=new int[3];
	values[0]=10;
	values[1]= new Integer(5);
	values[2]=7;
	for(int i=1;i<values.length;i++) {
		System.out.println("[i]" + values[i]);
		System.out.println("[i-1]" +values[i-1]);
		
		System.out.println(values[i]-values[i-1]);
		
	}
	}

	
	
}
	
	


