package chapter6;

public class Jump {
	
	private int rope=1;
	protected boolean outside;
	
	public Jump() {
		this(5);
		//new Jump(4);
		outside=true;
	}
	

	public Jump(int rope) {
		this.rope=outside?rope:rope+1;
		System.out.println(this.rope);
		
	}


	public static void main(String[] args) {
		
		System.out.print(new Jump().rope);
		
	}

}
