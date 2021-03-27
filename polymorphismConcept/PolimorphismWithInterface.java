package polymorphismConcept;
class newEmployee implements MobileAppExpert{

	@Override
	public void deliverMobileApp() {
		System.out.println("new Employee is an expert");
	}
	
}
class newProgrammer extends newEmployee{
	@Override
	public void deliverMobileApp() {
		System.out.println("new Programmer is an expert");
	}
	
}

class newManager extends newEmployee{
	@Override
	public void deliverMobileApp() {
		System.out.println("new Manager is an expert");
	}
	
}

public class PolimorphismWithInterface {

	public static void main(String[] args) {
		newEmployee one=new newProgrammer();
		newEmployee two=new newManager();
		one.deliverMobileApp();
		two.deliverMobileApp();

	}

}
