package interfaceInheritance;

import java.time.LocalDateTime;

public class TestInterfaceInheritance {

	public static void main(String[] args) {

		Manager mgr=new Manager();
		
		mgr.attendTraining();
		mgr.conductInterview();
		mgr.submitStatus();
		Interviewer.bookConferenceRoom(LocalDateTime.of(2020, 01, 20, 02, 30),30);
		
		Programmer prg=new Programmer();
		prg.attendTraining();
		
		
		
	}

	

}
