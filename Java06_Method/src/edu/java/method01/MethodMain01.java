package edu.java.method01;

// 메소드 : 주로 반복적으로 기능을 수행할 때 생성
// 메소드는 클래스 안 또는 다른 메소드 외부에서 만든다
// (메소드 안에 또 다른 메소드 생성은 불가)
// [수식어] 리턴타입 메소드명(매개변수, ){본문}
//  ㄴ public private, static ... public은 생략 가능
// 리턴타입 : 자료형, void, class ...
// 매개변수 : 함수 호출시 전달되는 데이터를 저장하는 변수 (전달할 데이터 없으면 생략가능)
// 본문 : 수행해야 할 기능 작성

public class MethodMain01 {

	//static 수식어 : 프로그램이 실행될 때 생성하도록 선언하는 키워드
	// * static 메소드에서는 static으로 선언된 메소드만 호출 가능
	public static void main(String[] args) {
		
		//System.out.println("저는 컴퓨터입니다.");
		//System.out.println("저는 스마트폰입니다.");
		sayHello("컴퓨터"); // 메소드 호출
		sayHello("스마트폰");
		
		sayAge(10);
		
	} // end main
	
	public static void sayHello(String name) {
		System.out.println("안녕하세요.");
		System.out.println("저는 " + name + "입니다.");
		
	} // end sayHello
	
	public static void sayAge(int age) {
		System.out.println("제 나이는 " + age + "입니다.");
	} // end sayAge

}
