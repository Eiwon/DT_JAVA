package edu.java.homework;

public class 정의원05_1 {

	public static void main(String[] args) {
		// 다음 문자열에서 숫자 구분하여 합
		String str = "2024년 02월 19일 16:37:53";
		
		int sum = 0;
		String[] numbers = str.split(":|년 |월 |일 ");
		for(String x : numbers) {
			sum += Integer.parseInt(x);
		}
		System.out.println("Sum = " + sum);
	}

}
