package ExceptionConcept;

import java.time.LocalDateTime;
import java.time.LocalTime;

class FeelingHungryException extends RuntimeException{}
//////////////////////////////////////////////////
class Trip{
void goTrecking(LocalDateTime startTime){

int hrs=LocalTime.now().getHour()-startTime.getHour();
if(hrs>=2) throw new FeelingHungryException();

}
}
///////////////////////////////////////////////////

class RunExceptionDemo{
public static void main(String[] args){
Trip t=new Trip();
//t.goTrecking(LocalTime.of(11,24));

}


}
