package polymorphismConcept;
 class Employee {}

class Programmer extends Employee implements MobileAppExpert{

	@Override
	public void deliverMobileApp() {
		System.out.println("Testing Complete on Real Device");
	}
	public String submitInterviewStatus() {
		System.out.println("Programmer-Accept");
		return null;
		
	}
	
}

class Manager extends Employee implements MobileAppExpert{

	@Override
	public void deliverMobileApp() {
		System.out.println("code delivered "); 
	}
	
	public String submitInterviewStatus() {
		System.out.println("Manager-Accept");
		return null;
		
	}
	
}

class PolimorphismWithoutInterface{
	public static void main (String[]args) {
		MobileAppExpert expert1=new Programmer();
		MobileAppExpert expert2= new Manager();
		
		expert1.deliverMobileApp();
		expert2.deliverMobileApp();
		
		
		expert1.submitInterviewStatus();expert2.submitInterviewStatus();
		
	}
}