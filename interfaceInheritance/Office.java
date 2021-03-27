package interfaceInheritance;

public class Office {

	public static void main(String[] args) {
		Interviewer[] inter=new Interviewer[2];
		inter[0]=new Manager();
		inter[1]=new HRexcutive();
		//inter[3]=new Employee();
		

		HRexcutive hr=new HRexcutive();
		hr.conductInterview();
		HRexcutive hr1=(HRexcutive) new Employee();//class cast exception
		hr.conductInterview();
	
		
		
	Employee emp=new HRexcutive();
	
	Interviewer iv=new HRexcutive();
	iv.conductInterview();
	
	((HRexcutive) iv).specialization=new String[1];
	
		
		
		
	}

}
