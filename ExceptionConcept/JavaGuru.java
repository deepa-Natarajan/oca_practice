package ExceptionConcept;//stack overflow error

class Course{

String coursename;
Course(){
Course c=new Course();
c.coursename="oracle";
}

}

class JavaGuru{
public static void main(String[] args){

Course c=new Course();
c.coursename="Java";
System.out.println("c.coursename");
System.out.println();


}


}