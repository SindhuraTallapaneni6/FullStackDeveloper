package com.cts.date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
    LocalDateTime localDateTime=LocalDateTime.of(2016, Month.JANUARY, 10, 11, 30);
		
		ZoneOffset zoneOffset=ZoneOffset.of("+05:30");
		OffsetDateTime offsetDateTime=OffsetDateTime.of(localDateTime, zoneOffset);
		System.out.println("Local DateTime Zone :"+offsetDateTime);

		
		//calculating months in between
//		LocalDate birthday=LocalDate.of(1998, Month.JULY, 06);
//		LocalDate today=LocalDate.now();
//		Period months=Period.between(birthday, today);
//		System.out.println("the gap is :",+months.getMonths());
//		
//		LocalDate today=LocalDate.now();
//		if(today.isLeapYear()) {
//			System.out.println("is leap year");
//		}
//		else
//			System.out.println("not leap year");
//		
//		
//   ZoneId zoneId=ZoneId.of("Asia/Calcutta");
		
//		LocalDateTime localDateTime=LocalDateTime.now();
//		ZonedDateTime zonedDateTime=ZonedDateTime.of(localDateTime, zoneId);
//		System.out.println("Date and Time in delhi :"+zonedDateTime);
//		
		
//		LocalDate date=LocalDate.now();
//		LocalDate tomorrow=LocalDate.of(2020, 1, 13);
//		if(date.isBefore(tomorrow)) {
//			System.out.println("true");
//		}
//		else
//			System.out.println("false");
//		if(date.isAfter(tomorrow))
//		{
//			System.out.println("true");
//			
//		}
//		else
//			System.out.println("false");

		
		
//		Clock clock=Clock.systemUTC();
//		System.out.println(clock);
//		Clock defaultClock=Clock.systemDefaultZone();
//		System.out.println(defaultClock);
		
		//find date after one week and year
//		LocalDate date=LocalDate.now();
//		LocalDate prev=date.minus(1,ChronoUnit.YEARS);
//		LocalDate next=date.plus(1,ChronoUnit.YEARS);
//		System.out.println("Todays date is :"+date);
//		System.out.println("Date after next year"+next);
//		System.out.println("Date befor previous year"+prev);
		
		//adding hours to time
//		LocalTime current=LocalTime.now();
//		LocalTime newtime=current.plusHours(2);
//		System.out.println(newtime);
		
		
		//to get current time
//		LocalTime current=LocalTime.now();
//		System.out.println("Current time is :"+current);
		
		

		//to check whether two dates are equal
//		 LocalDate today=LocalDate.now();
//		 LocalDate birthday=LocalDate.of(2020, 01, 14);
//		 MonthDay birth=MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
//		MonthDay current=MonthDay.from(today);
//		 if(birth.equals(current)) {
//			 System.out.println("Today :"+today+ "  and birthday:"+birthday+ "  are same dates");
//			
//		 }
//		 else
//			 System.out.println("not equal");
		
		
	//prints bithday
//		LocalDate birthday=LocalDate.of(1998, 07, 06);
//		System.out.println(birthday);
	
		
		
//     LocalDate date=LocalDate.now();
//		int day=date.getDayOfMonth();
//		int month=date.getMonthValue();
//		int year=date.getYear();
//		System.out.println("Day :" +day+ " Month :" +month+ " Year: "+year);
		
		
		
		
    //  System.out.println(date);//returns date in the system
//      int day=date.getDay();
//      switch (day) {
//	case 0:System.out.println("sunday");
//		
//		break;
//	case 1:System.out.println("monday");
//	
//	break;
//	case 2:System.out.println("Tuesday");
//	
//	break;
//	case 3:System.out.println("wednesday");
//	
//	break;
//	case 4:System.out.println("Thursday");
//	
//	break;
//	case 5:System.out.println("Friday");
//	
//	break;
//	case 6:System.out.println("Saturday");
//	
//	break;
//
//
//	default:
//		break;
//	}
      
      
	}

}
