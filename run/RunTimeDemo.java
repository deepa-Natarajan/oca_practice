package run;
import java.time.LocalDateTime;
import java.time.LocalTime;

class FeelingHungryException extends RuntimeException{}
//////////////////////////////////////////////////
class Trip{
void goTrecking(LocalTime startTime){

int hrs=LocalTime.now().getHour()-startTime.getHour();
if(hrs<=2) throw new FeelingHungryException();

}
}
///////////////////////////////////////////////////

class RunTimeDemo{
public static void main(String[] args){
Trip t=new Trip();
t.goTrecking(LocalTime.of(12,24));

}


}
