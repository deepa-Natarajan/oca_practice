package chapter6;

public class ReturningValues {
	
	static int num=1;
	static String s="abc";
	
		
	public static int number(int n) {
		
		return ++n;
	}
	public static String letters(String s) {
		return s+"d";
	}

	public static void main(String[] args) {
		
		int n=number(num);
		String str= letters(s);
		
		System.out.println(num+ "||" + s + "||" + str + "||" + n);	
		
		
		

	}

}
