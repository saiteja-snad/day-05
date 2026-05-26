package day4and5;
import java.time.*;
import java.util.*;
public class Age {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter birth year: ");
		int year=sc.nextInt();
		
		System.out.println("ente birth month :");
		int month=sc.nextInt();
		
		System.out.println("enter birth day");
		int day=sc.nextInt();
		LocalDate birtday=LocalDate.of(year, month, month);
		LocalDate currentdate=LocalDate.now();
		Period age=Period.between(birtday, currentdate);
		System.out.println("age is : "+age.getYears()+"years"+age.getMonths() +"months"+age.getDays()+"days");
	}

}
