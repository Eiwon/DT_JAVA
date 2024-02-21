package edu.java.lambda02;

import java.util.Scanner;

@FunctionalInterface
interface Test1{
	public abstract void testPrint();
}

@FunctionalInterface
interface Test2{
	public abstract void testPrint(int n);
}

public class LambdaMain02 {

	public static void main(String[] args) {
		System.out.println("- 익명 클래스, 람다 표현식 연습 -");
		// 람다 표현식
		// (매개변수1, 매개변수2, ...) -> { 실행문; 리턴; }
		// 매개변수와 리턴타입은 인터페이스의 추상메소드에 의해 결정
		// 인터페이스 변수명 = 람다 표현식

		// 1. "익명 클래스 연습!" 을 출력하는 익명 클래스(Test1) 생성 및 출력하기
		Test1 q1 = new Test1() {

			@Override
			public void testPrint() {
				System.out.println("익명 클래스 연습!");
			}};
		q1.testPrint();
		
		// 2. "람다 표현식 연습!" 을 출력하는 람다 표현식(Test1) 생성 및 출력하기
		Test1 q2 = () -> {
			System.out.println("람다 표현식 연습!");
			};
		q2.testPrint();
			
		// 3. Test2를 이용하여 정수 하나를 입력받아 "입력한 숫자는 : 100"을 출력하는
		// 		익명 클래스 생성 및 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		Test2 q3 = new Test2() {
			
			@Override
			public void testPrint(int n) {
				System.out.println("입력한 숫자는 : " + n);
			}};
		q3.testPrint(sc.nextInt());
		
		// 4. Test2를 이용하여 정수 하나를 입력받아 "입력한 숫자는 : 200"을 출력하는
		// 		람다 표현식 생성 및 출력하기
		System.out.println("정수 입력 > ");
		Test2 q4 = (n) -> {
			System.out.println("입력한 숫자는 : " + n);
			};
		q4.testPrint(sc.nextInt());
		sc.close();
	} // end main

} // end LambdaMain02
