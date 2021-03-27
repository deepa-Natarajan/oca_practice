package polymorphismConcept;

public interface MobileAppExpert {
	void deliverMobileApp();
	
	default Object submitInterviewStatus() {
		
		System.out.println("Status-Accept");
		return null;
		
	}

}
