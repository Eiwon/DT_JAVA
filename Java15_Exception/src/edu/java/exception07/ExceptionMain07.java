package edu.java.exception07;

import java.util.Scanner;

public class ExceptionMain07 {

	public static void main(String[] args) {
		System.out.println("try-catch-finally");

		/* try {
		 * 		정상 실행 코드
		 * } catch (Exception e){
		 * 		예외 실행 코드
		 * } finally {
		 * 		어떤 상황이든 실행 코드
		 * }
		 * */
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a / b;
			System.out.println("try 끝 : result = " + result);
		}catch (Exception e) {
			System.err.println("예외 : " + e.toString());
		} finally {
			System.out.println("finally : 언제 실행될까요?");
			sc.close();
		}
		System.out.println("프로그램 종료");
		
	} // end main

} // end ExceptionMain07
