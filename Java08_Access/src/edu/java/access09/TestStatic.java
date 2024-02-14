package edu.java.access09;

public class TestStatic {

	int num1; // 인스턴스 멤버 변수
	static int num2; // 클래스 멤버 변수
	
	// 인스턴스 메소드
	public void display1() {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
	
	// 클래스 메소드
	public static void display2() {
	//	System.out.println("num1 = " + num1);
		// static 메소드는 인스턴스 멤버 변수 사용 불가
		System.out.println("num2 = " + num2);
		
		
	}
	
} // end TestStatic
