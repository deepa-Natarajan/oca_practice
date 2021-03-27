import java.io.*;

public class NestedTry{
static FileInputStream players,coach;
public static void main(String[] args){
	try{
		players=new FileInputStream("players.txt");
		System.out.println("players .txt found");
		try{
		coach.close();
		}catch(IOException e){
		System.out.println("coach.txt not found");
		}
   }catch(FileNotFoundException e){
	System.out.println("players .txt not found");
	}catch(NullPointerException e){
	System.out.println("Null pointerException");
	}
}
}