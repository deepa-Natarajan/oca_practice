
public class NestedDemo {

	public static void main(String[] args) {
		int m = 2,n=6;
		
	int x=0; x += m+n;
	System.out.println(x);
	String s1="a";
	String s2=s1.concat(s1);
	System.out.println(s2);
	
	System.out.println(s2.concat("3"));
	System.out.println(s2);
		
		
		
		
		int[][] complexArray= {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		for(int[] simpleArray: complexArray) {
			for(int num: simpleArray) {
				
				System.out.print(num);
			
			}
			System.out.println();
		}
		
		
		for(int i=0;i<complexArray.length;i++) {
			for(int y=0;y<4;y++) {
				System.out.print(complexArray[i][y]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
