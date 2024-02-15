package edu.java.inherit03;

public class Phone {
	// 멤버 변수
	private String number;
	
	// 클래스의 기본 생성자를 생략하면 컴파일러가 만들어줌
	// 생성자를 하나라도 정의한 경우, 자바 컴파일러는 기본 생성자를 만들어 주지 않음
	
	public Phone(String number) {
		this.number = number;
		System.out.println();
	}

	
	
}
