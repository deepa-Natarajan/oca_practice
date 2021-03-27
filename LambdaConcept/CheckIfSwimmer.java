package LambdaConcept;

public class CheckIfSwimmer implements checkTrait{

	@Override
	public boolean test(Animal a) {
		// TODO Auto-generated method stub
		return a.canSwim();
	}

}
