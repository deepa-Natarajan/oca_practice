
public class StringMethodDemo {
	public static void speak(StringBuilder s) {
		StringBuilder ns=s.append("Loud");
		System.out.println(ns);
		
	}

	public static void main(String[] args) {
		String word="Apple";
		
		//replace()
		
		System.out.println("deepa".replace('d', 'D'));
		System.out.println("deepa".replace("deepa","Deepa "));
		
		
		//Contains()
		
		System.out.println("Deepa".contains("h"));
		
		//startswith() endswith()
		System.out.println(word.startsWith("A") + "\n" + word.endsWith("e"));
		//String name="speak";
		
		StringBuilder s=new StringBuilder();
		speak(s);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
