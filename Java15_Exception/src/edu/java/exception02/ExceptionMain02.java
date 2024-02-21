package edu.java.exception02;

import java.util.Scanner;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("예외 사례");
		
		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		if(n2 != 0) {
//			int result = n1 / n2;
//			System.out.println("result = " + result);
//		}else {
//			System.err.println("n2 값이 0이 아닌 값을 입력");
//		}
		
		// 예외 처리 : try-catch 구문
		// - 예외 발생 상황에 대해 처리해주는 기능
		// try {
		// 		정상 실행 코드;
		// } catch(예외클래스 변수명){
		//		예외 상황때 실행 코드
		//}
		try {
			System.out.println("try 내부");
			System.out.println("n3 입력 > ");
			int n3 = sc.nextInt();
			System.out.println("n4 입력 > ");
			int n4 = sc.nextInt();
			int result = n3/n4;
			System.out.println("result = " + result);
		} catch (Exception e) {
			System.err.println("예외 발생 : " + e.toString());
		}
		System.out.println("프로그램 종료");
		sc.close();
	} // end main

} // end ExceptionMain02
