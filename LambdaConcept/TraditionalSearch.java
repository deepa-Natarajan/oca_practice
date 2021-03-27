package LambdaConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		 animals.add(new Animal("kangaroo", true, false));
		 animals.add(new Animal("rabbit", true, false));
		 animals.add(new Animal("turtle", false, true));
		
		// print(animals, new CheckIfHopper()); // pass class that does check
		// print(animals, new CheckIfSwimmer());
		 checkTrait hop=a ->a.canHop();
		 checkTrait swm=a ->a.canSwim();
		 CheckLetter chkl=(Animal a) ->{return a.checkLetter();} ;//lambda expression including optional parts.
		 
		// print(animals, hop);
		 printLetter(animals, a -> a.checkLetter());
		
		 

	}
	private static void printLetter(List<Animal> animals, Predicate<Animal> chkl) {
		for (Animal animal : animals) {
			if (chkl.test(animal)) // the general check
			 System.out.print("Letter-" + animal + " ");
			 }
			System.out.println();
			}
	
	private static void print(List<Animal> animals, checkTrait hop) {
		for (Animal animal : animals) {
			if (hop.test(animal)) // the general check
			 System.out.print("Hopper-" + animal + " ");
			 }
			System.out.println();
			}

			/*
			 * private static void print(List<Animal> animals, CheckIfSwimmer Swimmer) { for
			 * (Animal animal : animals) { if (Swimmer.test(animal)) // the general check
			 * System.out.print("Swimmer-" + animal + " "); } System.out.println(); }
			 * 
			 * 
			 * 
			 * 
			 * private static void print(List<Animal> animals, CheckIfHopper checker) {
			 * 
			 * for (Animal animal : animals) { if (checker.test(animal)) // the general
			 * check System.out.print("Hopper-" + animal + " "); } System.out.println(); }
			 */
		
	}


