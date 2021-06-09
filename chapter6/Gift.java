package chapter6;

public class Gift {
	
	private final Object contents = new Object();
	
	
	
	protected Object getContents() {return contents;};
	//protected void setContents(Object Contents) {this.contents = contents;};
	public void showPresent() {
		System.out.print("Your gift: "+contents);
		}
	public static void main(String[] args) {
		Gift gift = new Gift();
		
		//gift.setContents(gift);
		gift.showPresent();
	}

}
