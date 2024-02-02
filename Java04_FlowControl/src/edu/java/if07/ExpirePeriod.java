package edu.java.if07;

import java.util.*;

public class ExpirePeriod {

	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {
				"2021.05.02 A", 
				"2021.07.01 B", 
				"2022.02.19 C", 
				"2022.02.20 C"
				};
		int[] answer = new int[privacies.length];
		int ansIdx = 0;
		
		// 모든 달은 28일까지
        // privacies의 각 날짜에 terms의 각 항만큼 월 더하기
        // 그 값이 오늘 날짜보다 작으면 answer에 추가
        // terms = 해시맵에 저장
        // 모든 privacies 원소에 대하여,
        // 추출한 원소에 해당하는 term 검색 후 날짜 계산
        // 날짜 계산 : privacies + term < today?
		
		// today 형태 변환
		String[] d = new String[3];
		int[] tDay = new int[3];
		d = today.split("[.]");
		for(int i=0; i<3; i++)
			tDay[i] = Integer.parseInt(d[i]);
		
		// terms = 해시맵에 저장
		HashMap<Character, Integer> termsMap = new HashMap<>();
		for(int i=0; i<terms.length; i++) {
			String[] temp = new String[2];
			temp = terms[i].split(" ");
			termsMap.put(temp[0].charAt(0), Integer.parseInt(temp[1]));
		}
		
		for(int i=0; i<privacies.length; i++) {
			//privacies 값 변환
			String[] temp = new String[4];
			temp = privacies[i].split("[. ]");
			int expPeriod = termsMap.get(temp[3].charAt(0));
			int[] pDay = new int[3]; 
			for(int j=0; j<3; j++)
				pDay[j] = Integer.parseInt(temp[j]);
			pDay[0] += (pDay[1] +expPeriod) /12;
			pDay[1] = (pDay[1] +expPeriod) %12;
			System.out.println(i + " : " + pDay[0] + "." + pDay[1] + "." + pDay[2]);
			//만료 체크 (tday - pday)
			if(isExpired(tDay, pDay) == true) {
				System.out.println(i + " : " + privacies[i].toString());
				//answer에 추가
				answer[ansIdx++] = i+1;
			}
		}
		
		
	}
	
	public static boolean isExpired(int[] today, int[] target) {
		
		if(today[0] > target[0])
			return true;
		else if(today[0] < target[0])
			return false;
		else {
			if(today[1] > target[1])
				return true;
			else if(today[1] < target[1])
				return false;
			else {
				if(today[2] >= target[2])
					return true;
				else return false;
			}
		}

	}
	
//	public class Date{
//	int year, month, day;
//	
//	public Date(String year, String month, String day) {
//		this.year = Integer.parseInt(year);
//		this.month = Integer.parseInt(month);
//		this.day = Integer.parseInt(day);
//	}
//	
//	public Date(int year, int month, int day) {
//		this.year = year;
//		this.month = month;
//		this.day = day;
//	}
//	//만료일today보다 
//	public boolean isExpired(Date today, int expPeriod) {
//		//유효기간은 1~100달 정수
//		Date expDate = new Date(year +(month +expPeriod) /28, (month +expPeriod) % 28, day);
//		
//		if(today.year > expDate.year)
//			return false;
//		else if(today.year < expDate.year)
//			return true;
//		else {
//			if(today.month > expDate.month)
//				return false;
//			else if(today.month < expDate.month)
//				return true;
//			else {
//				if(today.day > expDate.day)
//					return false;
//				else return true;
//			}
//		}
//	}
//
//	}


	
}