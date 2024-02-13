package edu.java.access03;

// 캡슐화(encapsulation)
// - 클래스를 설계할 때, 멤버 변수들을 private 선언하여
// 외부 클래스에서 멤버 변수들을 직접 접근해서 읽거나 쓰지 못하게 하는것
// - 필요한 경우에 한해서 public 메소드를 정의하여
//  private 멤버 변수를 간접적으로 읽어나 쓰는 것을 가능하게 할 수 있음
//  ㄴ 변수에 잘못된 값 입력 방지 가능, 동기화 문제 해결 용이

public class AccessMain03 {

	public static void main(String[] args) {
		MyNumber num = new MyNumber(100);
		System.out.println("number = " + num.getNumber());
		num.setNumber(10);
		System.out.println("number = " + num.getNumber());
		
	} // end main

} // end AccessMain03
