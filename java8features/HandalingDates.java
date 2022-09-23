package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandalingDates {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date & Time: "+currentDateTime);
		
		LocalDate annotherDate = LocalDate.parse("2014-11-25");
		System.out.println("Annother date using parse : "+annotherDate);
		
		LocalDate annotherDate2 = LocalDate.of(2011, 5, 15);
		System.out.println("Annother date using parse : "+annotherDate2);
		
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("Yesterday's Date : "+yesterday);
		
		LocalDate tomorrow = currentDate.plusDays(1);
		System.out.println("Tomorrow's Date : "+tomorrow);
		
		System.out.println("Is leap Year?"+currentDate.isLeapYear());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatterDate = currentDateTime.format(formatter);
		System.out.println("Formatted Date : "+formatterDate);
		
		Month month = currentDateTime.getMonth();
		int day = currentDateTime.getDayOfMonth();
		int year = currentDateTime.getYear();
		
		int hour = currentDateTime.getHour();
		int min = currentDateTime.getMinute();
		int sec = currentDateTime.getSecond();
		
		System.out.println("Date is : "+day+"-"+month+"-"+year+" "+hour+":"+min+":"+sec);
		
		ZonedDateTime current = ZonedDateTime.now();
		System.out.println("\nCurrent Date & Time : "+current);
		System.out.println("Current Zone : "+current.getZone());
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tokyoZone = current.withZoneSameInstant(tokyo);
		System.out.println("Tokyo Zone : "+tokyoZone);
		
	}

}
