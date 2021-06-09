package chapter6;

public class FootBall {
	public static Long getScore(Long timeRemaining) {
		return 2*timeRemaining;
	}

	public static void main(String[] args) {
		final int startTime = 4;
		System.out.print(getScore((long) startTime));

	}

}
