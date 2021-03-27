package ExceptionDemo;

class FallInRiverException extends Exception{}
class DropOarException extends Exception{}
class RiverRafting{
void crossRapid(int degree) throws FallInRiverException {
if (degree >10) throw new FallInRiverException ();
}
}

class ExceptionDemo{
public static void main(String[]args) throws FallInRiverException{
RiverRafting rf= new RiverRafting();
System.out.println("Throws declared");
rf.crossRapid(9);
}
}