package edu.java.class02;

//클래스 : 
//		상태(속성, 성질) : 멤버 변수(field, property)
//		기능 - 메소드
//		생성자(constructor) - 멤버 변수들을 초기화하는 함수
//			- 클래스명과 동일
//			- 매개변수는 있을수도 있고 없을수도 있음
//			- 생성자를 정의하지 않은 경우, 자바 컴파일러가 자동으로 만들어줌

public class MyRectangle {
	
	// 멤버 변수
	double width; // 사각형의 가로
	double height; // 사각형의 세로
	
	// 기본 생성자
	public MyRectangle() {
		
	}
	
	// 매개변수가 있는 생성자
	public MyRectangle(double width, double height) {
		this.width = width;
		this.height = height;
		// this : 클래스자기 자신
	}
	
	// 메소드
	public double calcArea() {
		return width * height;
		
	}
	
} // end MyRectangle
