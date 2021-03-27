package ExceptionConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReturnFromCatchBlock {

	public static void main(String[] args) throws IOException {
	openFile();

	}

	private static void openFile() throws IOException {
		
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("file.txt");
			fis.close();
		}catch(IOException e) {
			
		}finally {
			System.out.println("Finally excuting with return statement from the catch");
		}
		
		
		
		
		
	}

}
