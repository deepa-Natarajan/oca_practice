package chapter4;

public class SwitchDemo {
	static public int roomInBelly=5;
	
	
	public void eatCheese(int bitesOfCheese) {
		while (bitesOfCheese > 0 && roomInBelly > 0) {
		bitesOfCheese--;
		roomInBelly--;
		}
		System.out.println(bitesOfCheese+" pieces of cheese left");
		}

	public static void main(String[] args) {
		
		
		SwitchDemo s= new SwitchDemo();
		s.eatCheese(6);
		
		
//		letters: for (int i=0;i<3;i++) {
//			numbers:for(int j=10;j<13;j++) {
//				
//				System.out.println( i+"||"+j);
//				if(i==1)
//				break numbers;
//			}
//			
//		}
		int k = 0;
		for (int i = 10; i > 0; i-- ) {
		while (i > 3) 
			i -= 3;
		k += 1;
		}
		System.out.println(k);
		
		
		
		
		
		
		
		
	}

}
