package edu.java.access09;

// static : 멤버 변수 또는 메소드를 선언(정의)할 때 사용
// - 인스턴스 생성 이전에 프로그램이 처음 시작될때 static 메모리 영역에 자동 생성
// 인스턴스 = new로 선언할 때 메모리에 생성
// static = 프로그램이 처음 실행될 때 메모리에 생성

// * 클래스 멤버 변수(static 변수) : static으로 선언한 멤버 변수
// - 인스턴스 생성 없이 사용 가능
// - static 변수는 메소드 영역에 생성된 공간에서 공유됨
// - 모든 인스턴스가 공유하기 때문에 값 변경시 주의
// - 사용 형식 : 클래스명.변수명

// * 인스턴스 멤버 변수 : static으로 선언하지 않은 멤버 변수
// - 인스턴스를 생성한 후에만 사용 가능한 변수
// - 사용 형식 : 
// 		Any 참조변수 = new Any();
// 		참조변수.변수명

// * 클래스 메소드(static 메소드) : static으로 선언한 메소드
// - 인스턴스 생성 없이 사용 가능
// - 사용 형싱 : 클래스명.메소드()

// * 인스턴스 메소드 : static 선언되지 않은 메소드
// - 인스턴스 생성 후에만 사용 가능
// - 사용 형식 : 
// 		Any 참조변수 = new Any();
// 		참조변수.메소드()


public class AccessMain09 {

	public static void main(String[] args) {
		
		// static 멤버 변수 = 인스턴스 생성 없이 사용가능
		TestStatic.num2 = 123;
		System.out.println(TestStatic.num2);
		
		TestStatic test = new TestStatic();
		test.num1 = 100;
		System.out.println(test.num1);

		// static 메소드 = 인스턴스 생성 없이 사용가능
		TestStatic.display2();
		
		test.display1();
		
		
	} // end main

} // end AccessMain09







