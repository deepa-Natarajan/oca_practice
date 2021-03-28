package LambdaConcept;

import java.util.ArrayList;
import java.util.List;

public class GradeLambda {
	String name, grade;
	public String getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	GradeLambda(String name, String grade){
		this.name=name;
		this.grade=grade;
	}

	 interface  namePrint {
		 String print(GradeLambda gl);
		 
	 }
	public static void main(String[] args) {
		GradeLambda g1=new GradeLambda("Anita", "A");
		GradeLambda g2=new GradeLambda("Bety", "B");		
		
		List<GradeLambda> list= new ArrayList<>();
		list.add(g1); list.add(g2);		
		
		printName(list, g->g.getName() );
		
	}
	private static void printName(List<GradeLambda> list, namePrint np) {

		for (GradeLambda gl:list) {
			if(gl.grade=="A")
				System.out.println(gl.getName());
			
		}
		
		
	}

}
