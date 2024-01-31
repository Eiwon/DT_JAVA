package edu.java.variable08;
import java.util.*;

public class ScannerMain01 {

	public static void main(String[] args) {
		System.out.println("변수 입력");

		//입력을 받기 위한 Scanner 선언
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		// test
//		System.out.println("국어 점수 입력 : ");
//		int kor = sc.nextInt();
//		System.out.println("국어 점수 : " + kor);

		// nextInt() : 정수 입력 메소드
		// nextDouble() : 실수 입력 메소드
		// nextLine() : 문자열 1줄 입력 메소드
		// next() : 문자열 1줄 입력(\n 버퍼 처리) 메소드
		
		System.out.println("실수 입력 : ");
		double x = sc.nextDouble();
		System.out.println("x = " + x);
		
		
	}

}
