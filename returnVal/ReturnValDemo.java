package returnVal;

class MultipleVal{
int getInt(){
int returnVal=10;
try	{
	String[] students={"Tom","Harry"};
	System.out.println(students[5]);
    }catch(Exception e){
	System.out.println(e);
	return returnVal ;
    }finally{
	returnVal+=10;//Modified value will never be returned from finally block
	
	System.out.println(returnVal);
	//return 25;
}
return returnVal;
}

}
////////////////////////////////////////////////
class ReturnValDemo{

public static void main(String[] args){

MultipleVal mv= new MultipleVal();
System.out.println(mv.getInt());


}


}