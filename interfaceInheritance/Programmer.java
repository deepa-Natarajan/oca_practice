package interfaceInheritance;

 class Programmer extends Employee implements Trainable {
	String programmingLanguage;
	void writeCode() {}
	public void attendTraining() {
		
		System.out.println("Programmer - Attend Training ");
	}


}
