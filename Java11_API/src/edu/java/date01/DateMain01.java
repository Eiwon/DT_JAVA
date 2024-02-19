package edu.java.date01;

import java.util.Date;

public class DateMain01 {

	public static void main(String[] args) {

		// 시스템의 현재 시간 정보
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		// 미국시간 1970년 1월 1일 0시 0분 0초를 기준으로
		// milli second 단위 시간

		System.out.println();
		Date date2 = new Date(0L); // 기준 시간으로 초기화
		System.out.println(date2);
		Date date3 = new Date(1000L); // 기준 시간 +1
		System.out.println(date3);
		
	} // end main

} // end DateMain01
