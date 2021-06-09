package chapter7;

public class Lion extends Animal {

	public Lion(int age) {
		super(age);

	}

	public Lion() {
		this(4);
		//super();
	}

	public void roar() {
		System.out.println("The " + getAge() + " year old lion says Roar!");
	}

	public static void main(String[] args) {

		Lion lion = new Lion();
		lion.roar();
		lion.setAge(10);
		lion.roar();
	}

}

class Animal {
	private int age;

	public Animal(int age) {
		this();
		this.age = age;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}