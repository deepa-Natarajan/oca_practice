package ExceptionConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleException {

	public static void main(String[] args)  {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("file.txt");
			System.out.println("File Opened");
			fis.read();
		}catch(FileNotFoundException e) {
			System.out.println("File not found exception");
			
		}catch (IOException e) {
			System.out.println("I/o Exception");
		}finally {
			System.out.println("Finally");
		}
		
		System.out.println("Next Task");
		
		
			
	}

}
