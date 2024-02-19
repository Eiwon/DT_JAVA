package edu.java.date03;

import java.util.Calendar;

public class DateMain03 {

	public static void main(String[] args) {
	
		// Calendar : 추상 클래스
		// ㄴ GregorianCalendar : Calendar의 자식 클래스
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//날짜와 시간 정보 추출
		int year = cal.get(Calendar.YEAR);
		System.out.println("year : " + year);
		
		int month = cal.get(Calendar.MONTH) +1;
		System.out.println("month : " + month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("day : " + day);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour : " + hour);
		// Calendar.HOUR : 12시간 단위, HOUR_OF_DAY : 24시간 단위
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("minute : " + minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println("second : " + second);
		
		
		
	} // end main

} // end DateMain03
