package LambdaConcept;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	String name;
	boolean hop;boolean swim;
	Animal(String name,boolean hop, boolean swim){
		this.name=name;this.hop=hop;this.swim=swim;
	}
	boolean canHop() {return hop;};boolean canSwim(){return swim;};
	
	interface checkTrait{
		boolean test(Animal a);
	}
	static void show(List<Animal> ani, checkTrait ct) {
		for (Animal amal:ani) {
			if(ct.test(amal))
				System.out.println(amal.name);
		}
	}

	public static void main(String[] args) {
		List<Animal> ani=new ArrayList<>();
		Animal a=new Animal("Bunny",true,false);ani.add(a);
		Animal b=new Animal("fish",false,true);ani.add(b);
		
		//checkTrait checkHop = c->c.canHop(); checkTrait checkSwim=d->d.canSwim();
		show(ani,c->!c.canHop());
	
		

	}
	

}
