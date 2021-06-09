package chapter4;


public class SwitchExample {
//	private static int count;
	private static String[] stops = new String[] { "Washington",
	"Monroe", "Jackson", "LaSalle" };

		public static void main(String[] args) {
		/*FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
		for (int x = 10; x <= 14; x++) {
		if (a == 2 || x == 12)
		//continue;// FIRST_CHAR_LOOP
		System.out.println(" " + a +"||"+ x);
		}*/
		
		
		
		/*while (count < stops.length) {
		if (stops[count++].length() < 8) 
		break;
		
		}
		System.out.println(count);
		}*/
		
			int count = 0;
		do {
			
			do {
			count++;
			} while (count < 2);
			break;
			} while (true);
			System.out.println(count);
			
			
			

}
}
