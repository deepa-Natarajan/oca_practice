package chapter4;

import java.util.Arrays;
import java.util.List;

public class PracticeDemo {
	private static int count;
	private static String[] stops = new String[] { "Washington",
			"Monroe", "Jackson", "LaSalle" };

	public static void main(String[] args) {
		
		List<String> exam=Arrays.asList("OCA","OCP");
		for(String e1:exam)
			for(String e2 :exam)
				System.out.println(e1+ " "+ e2);
		
						
		while (count < stops.length) {
		if (stops[count++].length() < 8) {
		continue;
		}
		}
		System.out.println(count);
		
		
		String tie=null;
		while(tie==null)
			tie="shoelace";
		System.out.println(tie);
		
		
		/*
		 * List<String> names=Arrays.asList("glass","bottle"); for (int
		 * i=0;i<names.size();) { System.out.print(names.get(i) + ","); break; }
		 * System.out.print("end");
		 */
		
		String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
		String[] times = new String[] { "Day", "Night" };
		for (int i = 0, j = 0; i < nycTourLoops.length && j < times.length; i++,j++)
		{
		System.out.print(nycTourLoops[i] + " " + times[j] + "-");
		}	
		System.out.println();
		
		String race="";
		loop:
			do {
				race+="x";
				break loop;
				
			}while(true);
		System.out.println("race" +race);
	
	
	
	}


}
