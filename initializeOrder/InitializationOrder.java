package initializeOrder;
public class InitializationOrder {
	
 private String name = "Torchie";
 
 { System.out.println(name); }//third
 
 private static int COUNT = 0;
 static { System.out.println(COUNT); }//first-->0
 
 { COUNT++; System.out.println(COUNT); }//fourth
 
 public InitializationOrder() {
 System.out.println("constructor");//fifth
 }
 
 public static void main(String[] args) {
 System.out.println("read to construct");//sec
 new InitializationOrder();
 }
 }