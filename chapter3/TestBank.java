package chapter3;


class BankAccount {

	int acctType;
	String acctNum;

	public BankAccount(String acctNum, int acctType) {
		this.acctNum = acctNum;
		this.acctType = acctType;
	}

	
	  public boolean equals(Object obj) {
	  
	  if(obj instanceof BankAccount) { BankAccount b=(BankAccount) obj;
	  
	  return (((acctNum.equals(b.acctNum))&&(acctType==(b.acctType)))); } else
	  
	  return false;
	  
	  }
	  
	 
	/*
	 * public boolean equals(BankAccount b) { if (b != null) { return
	 * (((acctNum.equals(b.acctNum))&&(acctType==(b.acctType)))); }else { return
	 * false; } }
	 */

}

public class TestBank {

	public static void main(String[] args) {
		
		
		
		BankAccount b1 = new BankAccount("12345", 1);
		BankAccount b2 = new BankAccount("12345", 1);
		BankAccount b3 = new BankAccount("12335", 2);

		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));

	}

}
