package chapter7;
class Math{
	
	public final double secret = 2;
}

class ComplexMath extends Math{
	public final double secret = 4;
}
public class InfiniteMath extends ComplexMath {
	public final double secret = 8;

	public static void main(String[] args) {
		//System.out.println((new InfiniteMath().secret));
		Math math=new  InfiniteMath();
		System.out.println(math.secret);
		
	}

}
