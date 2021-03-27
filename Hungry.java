class Hungry{

public void eatMore(boolean hungry, int amountOfFood){

int roomInBelly=5;
if(hungry){

	boolean timeToEat=true;
	
	while(amountOfFood>0){
	int amountEaten=2;
	roomInBelly=roomInBelly-amountEaten;
	amountOfFood=amountOfFood-amountEaten;
	System.out.println(amountOfFood);

	}
	}
System.out.println(amountOfFood);
}

public static void main(String[] args){


Hungry h=new Hungry();
h.eatMore(true,6);
h.eatMore(false,8);

}



}