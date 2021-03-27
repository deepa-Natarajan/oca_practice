package interfaceInheritance;

import java.time.LocalDateTime;

public interface Interviewer {
	
	
	public void conductInterview();
	
	default void submitStatus() {
		System.out.println("Accept");
	}
	static void bookConferenceRoom(LocalDateTime ldt, int duration) {
		System.out.println(ldt + ":" + duration);
	}

}
