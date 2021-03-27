package dtpack;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DtDemo {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.of(2012,12,28);
		LocalTime time=LocalTime.of(5,30);
		LocalDateTime ldt=LocalDateTime.of(date, time);
		
		
		System.out.println(date.getDayOfWeek());
		System.out.println(time.getHour());
		
		System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		FormatStyle fs=FormatStyle.SHORT;
		
		DateTimeFormatter dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dtf1=DateTimeFormatter.ofLocalizedDateTime(fs, fs);
		System.out.println(dtf.format(ldt));
		System.out.println(dtf1.format(ldt));
		
		DateTimeFormatter d=DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(ldt.format(d));
		
		
		
		
		
		
		
		
		
		
	}

}
