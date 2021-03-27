package ExceptionConcept;

class Ink{}
interface Printable{}
class ColorInk extends Ink implements Printable{}
class BlackInk extends Ink{}



public class TwistInTaleCasting {

	public static void main(String[] args) {

		Printable printable=null;
		BlackInk blackInk=new BlackInk();
		if(blackInk instanceof Printable)
		{
		printable=(Printable) blackInk;
		}
		// Class cast Exception;
		//use instanceof to check before casting to avoid the calss cast exception
		
		
		
		
		
		
		
		
	}

}
