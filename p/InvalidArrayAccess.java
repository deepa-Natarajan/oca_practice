package p;
import java.io.*;
public class InvalidArrayAccess{

public static void main(String[] args){



rethrowExeption re=new rethrowExeption();

re.callThrow();


String[] students={"tom","Harry"};
try{
System.out.println(students[5]);
}catch(Exception e){
System.out.println(e);
}
System.out.println("All is well");

}


}


/////////////////////////////////


class rethrowExeption{

public void callThrow(){

try{
myMethod();
} catch (Exception e){
System.out.println(e);
}
}


public void myMethod() throws IOException{

FileInputStream soccer=new FileInputStream("soccer.txt");
soccer.close();
}





}


