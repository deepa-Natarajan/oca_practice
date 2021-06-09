package chapter7;

public class Movie extends Cinema{

	public Movie(String name) {
		super(name);
		
	}
	public Movie() {
		//super();
	}

	public static void main(String[] args) {
		System.out.println(new Movie("Another Trilogy").getname());
		System.out.println(new Movie().getname());

	}

}

class Cinema{
	private String name;
	public Cinema() {
		name="Super Movie";
	}
	public Cinema(String name) {
		this.name=name;
		
	}
	public String getname() {return name;}
}
