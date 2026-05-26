package day4and5;
import java.time.*;
public class Date {
	

	    public static void main(String[] args) {

	        LocalDate date = LocalDate.now();
	        LocalTime time = LocalTime.now();
	        LocalDateTime dt =
	                LocalDateTime.now();
	        System.out.println(time);
	        System.out.println(date);
	        System.out.println(dt);
	        System.out.println(
	                date.plusDays(6));
	        System.out.println(
	                date.minusDays(10));
	        System.out.println(
	                date.compareTo(date));
	        System.out.println(
	             date.getDayOfMonth());
	        System.out.print(date.getYear());
	    }
	}

