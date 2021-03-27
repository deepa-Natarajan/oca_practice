package pond.swan;

import pond.duck.MotherDuck;
import pond.shore.Bird;

public class Swan extends Bird{
	public void swim() {
		floatInWater();
		System.out.println(text);
		
	}
	
	public void helpOtherSwanSwim() {
		
		Swan other=new Swan();
		other.floatInWater();//package access to superclass.
		System.out.println(text);
		
	}
	
	public void helpOtherBirdSwim() {
		Bird other= new Bird();
		//other.floatInWater();Other.text; does not compile because , the code isn't inheriting from the bird. So, it doesn't get to use the protected member.
		floatInWater();
		
	}
	
	MotherDuck md=new MotherDuck();
	//md.noise;--> cannot access the default variables orthe method from other package.
	
	
	
	

}
