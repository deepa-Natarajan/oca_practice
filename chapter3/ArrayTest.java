package chapter3;

import java.util.Arrays;
public class ArrayTest {

	public static void main(String[] args) {
		
		int[] num= {4,2,7,5,9};//Sorting array
		Arrays.sort(num);
		for(int n:num)
			System.out.println(n);
		
		String[] str= {"A","aDC100","1000","10"};//sorting strings
		Arrays.sort(str);
		for(String s:str) {
			System.out.println(s);
		}
		
		int[][] multiD= {{1,2,3},{4,5,6,7},{8,9}};
		
		
		
		for(int[] m:multiD) {
			for (int n:m) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
