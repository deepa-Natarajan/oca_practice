package interfaceInheritance;

 class Manager extends Employee implements Interviewer, Trainable {
	int teamSize;
	void reportProjectSize() {}
	
	
	
	public void conductInterview() {
		System.out.println("Manager - conduct Interview");		
	}


	public void attendTraining() {
		
		System.out.println("Manager - Attend Training ");
	}

	public void submitStatus() {
		System.out.println("Accepted by Manager");
		
	}
	
	
	
	

}
