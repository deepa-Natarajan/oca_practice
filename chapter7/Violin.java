package chapter7;

interface MusicCreator {
	public Number play();
}

abstract class StringInstrument {
	public Long play() {
		return 3L;
	}
}

public class Violin extends StringInstrument implements MusicCreator {
	/*
	 * public int play() { return 12; }
	 */
}
