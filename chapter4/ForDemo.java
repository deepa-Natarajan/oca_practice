package chapter4;

public class ForDemo {

	public static void main(String[] args) {
		
		
		//Infinite loop
//		for( ; ; ) {
//			System.out.println("Hello World");
//			}
		
		//2.Adding Multiple Terms to the for Statement
		
		int x = 0;
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
		System.out.print(y + " ");
		}
		System.out.print('\n'+"X" +x);
			
		//3.Redeclaring a Variable in the Initialization Block
		
//		int x = 0;
//		for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
//		System.out.print(x + " ");
//		}
//		
		
		int x1 = 0;
		long y = 10;
		for(y = 0, x1 = 4; x1 < 5 && y < 10; x1++, y++) {
		System.out.print("x1-->"+x1 + " ");
		}
		
		
		/*
		 * //4. Using Incompatible Data Types in the Initialization Block for(long y =
		 * 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
		 * System.out.print(x + " "); }
		 */
		
		int[] values = new int[3];
		values[0] = 10;
		values[1] = new Integer(5);
		values[2] = 15;
		for(int i=1; i<values.length; i++) {
			
		System.out.print( values[i]-values[i-1]);
		}

	}

}
