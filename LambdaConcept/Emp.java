package LambdaConcept;

public class Emp {
	
	String name;
	int performanceRating;
	double salary;
	
	Emp(String e, int p,double s){
		name=e;
		performanceRating=p;
		salary=s;
		
	}

	public String getName() {
		return name;
	}

	
	public int getPerformanceRating() {
		return performanceRating;
	}

	
	public double getSalary() {
		return salary;
	}

	public String toString() {
		return name +'\n' + performanceRating +'\n' + salary;
	}
	
	
	
	

}
