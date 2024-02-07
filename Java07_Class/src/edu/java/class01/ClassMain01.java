package edu.java.class01;

public class ClassMain01 {

	public static void main(String[] args) {
		// 클래스의 "인스턴스"를 생성한다
		// 클래스명 변수명 = new 생성자();
		
		// 기본 타입 변수 : byte, char, int 등 실제 값을 변수 안에 저장
		// 참조 타입 변수 : 배열, 클래스, 인터페이스 등. 주소를 통해 객체 참조
		// BasicTv tv = 'new' BasicTv();
		BasicTv tv = new BasicTv();
		// 기본 생성자를 호출하여 인스턴스 생성시, 
		// 클래스의 멤버 변수는 기본 값으로 초기화
		tv.turnOnOff(); // power 버튼 클릭
		tv.displayInfo();
		
		tv.channelUp();
		tv.channelUp();
		tv.displayInfo();
		
		tv.channelDown();
		tv.channelDown();
		tv.displayInfo();
	} // end main

}
