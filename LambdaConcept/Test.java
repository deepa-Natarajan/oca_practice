package LambdaConcept;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Emp> eList= new ArrayList<>();
		Emp e1=new Emp("Paul",5,5000);
		Emp e2=new Emp("Tom",3,4000);
		Emp e3=new Emp("Sarath",9,600000);

		
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		
		
//		filter(eList, new ValidatePerformance());
		
		Validate vp=e ->e.getPerformanceRating()>5;
		filter(eList, vp);
		
	}
	static void filter(ArrayList<Emp> e, Validate v) {
		for(Emp emp:e) {
			if(v.check(emp)) {
				System.out.println(emp.toString());
				
			}
		}
		
	}

}
