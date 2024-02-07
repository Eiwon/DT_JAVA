package edu.java.method02;

public class MethodMain02 {

	public static void main(String[] args) {
		System.out.println("메소드 연습");
		
		int result = add(10, 20);
		System.out.println("result = " + result);
		
		result = sub(10, 20);
		System.out.println("result = " + result);
		
		double result2 = mul(10.0, 20.0);
		System.out.println("result = " + result2);
		
		double d = div(3, 2);
		System.out.println("result = " + d);
		
	} // end main

	//2개 정수를 매개변수로 받아서 합을 리턴
	// 메소드 명 : add, 리턴 타입 : int, 매개변수 : int x, int y
	public static int add(int x, int y) {
		return x + y;
	} // end add
	
	// 2개의 정수를 매개변수로 받아서 차를 리턴
	// 메소드 명 : sub, 리턴 타입 : int, 매개변수 : int x, int y
	public static int sub(int x, int y) {
		//int result = Math.abs(x-y);
		
		return x - y > 0 ? x - y : y - x;
	} // end sub
	
	// 2개의 실수를 매개변수로 받아서 곱을 리턴
	// 메소드 명 : mul, 리턴 타입 : double, 매개변수 : double x, double y	
	public static double mul(double x, double y) {
		return x*y;
	} // end mul
	
	// 2개의 실수를 매개변수로 받아서 x를 y로 나눈 값을 리턴
	// 메소드 명 : div, 리턴 타입 : double, 매개변수 : double x, double y		
	public static double div(double x, double y) {
		return x/y;
	} // end div
}
