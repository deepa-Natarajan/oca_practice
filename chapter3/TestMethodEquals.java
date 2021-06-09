package chapter3;

import java.util.ArrayList;
import java.util.List;

public class TestMethodEquals {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount("123",1);
		List<BankAccount> ba= new ArrayList<>();
		ba.add(b1);
		BankAccount b2=new BankAccount("123",1);
		//ba.add(b2);
		System.out.println(ba.contains(b2));
		
	}

}
