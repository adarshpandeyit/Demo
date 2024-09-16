package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.chrono.IsoChronology;
import java.time.chrono.IsoEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateAndTime {
	public static void main(String[] args) {
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now.toLocalDate());
//		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("EEEE-MM=yyy=dd");
//	
//		String date = pattern.format(now);
//		System.out.println(date);
		
		
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("EEEE-dd/MM-yyyy");
		LocalDate date = LocalDate.of(1999, 3, 7);
		String format = dt.format(date);
		System.out.println(format);
		System.out.println(date.getYear());
		
		
		
		
		
	//	LocalDate now = LocalDate.now();
//		LocalDate then = LocalDate.of(1999, 2, 17);
//		Period period = Period.between(now, then);
//		System.out.println(period);
	}

}
