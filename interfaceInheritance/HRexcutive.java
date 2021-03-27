package interfaceInheritance;

public class HRexcutive extends Employee implements Interviewer {
	
	HRexcutive(){
		this.name="gaga";//using this foraccessing thebaseclass variable
	}
	String[] specialization;
	

	@Override
	public void conductInterview() {
		System.out.println("HR--Conducts Interview");
		
	}

}
