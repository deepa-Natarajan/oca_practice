package chapter3;

import java.util.Arrays;

public class StringTest {
	private static String[][] matrix;
	String val="value";
	static int[][] game = new int[6][6];
	
	public static int getResult(int threshold) {
		return threshold > 5 ? 1 : 0;
		}
	
	public static void printStormName(String... names) {
		System.out.println(Arrays.toString(names));
		}public static void printStormNames(String[] names) {
		System.out.println(Arrays.toString(names));
		}

	public static void main(String[] args) {
		String lion [] = new String[] {"lion"};
		//String tiger [] = new String[1] {"tiger"};
		String bear [] = new String[] {};
		//String ohMy [] = new String[0] {};
		
		printStormName("Arelene");
		printStormName(new String[] { "Bret" });
		//printStormNames("Cindy");
		printStormNames(new String[] { "Don" });
		
		System.out.println(new StringTest().val.equals(null));
		
		
		int colorOfRainbow = 10;
		final int red = 10;
		switch(colorOfRainbow) {
		default:
		System.out.print("Home");
		break;
		case red:
		System.out.print("Away");
		
		}
		
		System.out.println(getResult(5)+getResult(1)
		+getResult(0)+getResult(2)+"");
		//---------------------------------------
		matrix= new String[1][2];
	
		
		matrix[0][0] = "Don't think you are, know you are."; // m1
		matrix[0][1] = "I'm trying to free your mind Neo"; // m2
		//matrix[1][0] = "Is all around you "; // m3
		//matrix[1][1] = "Why oh why didn't I take the BLUE pill?"; // m4
		
		
		String[] os = new String[] { "Mac", "Linux", "Windows" };
		Arrays.sort(os);
		System.out.println("MAC" + Arrays.binarySearch(os, "Mac"));
		String[] days = new String[] { "Sunday", "Monday", "Tuesday",
				"Wednesday", "Thursday", "Friday", "Saturday" };
		
				for (int i = 0; i < days.length; i++)
				System.out.println(days[i]);
		
	
	
	//--------------------------
	game[3][3] = 6;
	Object[] obj = game;
	//obj[3] = new Object[] {0,0,7};
	System.out.println(game[3][3]);
		

	}}

