package LambdaConcept;

 class ValidatePerformance implements Validate {
	
	public boolean check(Emp e) {
		return e.getName().startsWith("P");
		
	}

}
